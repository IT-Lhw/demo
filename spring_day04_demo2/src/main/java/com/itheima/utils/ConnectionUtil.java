package com.itheima.utils;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
@Component("connectionUtil")
public class ConnectionUtil {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private ThreadLocal<Connection> local = new ThreadLocal<Connection>();

    public void setLocal(ThreadLocal<Connection> local) {
        this.local = local;
    }

    public Connection getConnection(){
        Connection connection = local.get();
        try {
            if (connection == null){
                connection= dataSource.getConnection();
                local.set(connection);
            }
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void deleteConnection(){
        local.remove();
    }
}
