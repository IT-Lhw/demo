package com.itheima.utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtil {
    private ThreadLocal<Connection> local = new ThreadLocal<Connection>();
    private DataSource dataSource ;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getConnection(){
        Connection connection = local.get();
        if (connection == null){
            try {
                connection=dataSource.getConnection();
                local.set(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    public void deleteConnection(){
        local.remove();
    }
}
