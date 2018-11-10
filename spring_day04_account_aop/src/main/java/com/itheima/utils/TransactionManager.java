package com.itheima.utils;
import java.sql.SQLException;

public class TransactionManager {
    //声明一个ConnectionUtils对象
    private ConnectionUtils cu;
    //定义一个set方法，等待spring给我们注入

    public void setCu(ConnectionUtils cu) {
        this.cu = cu;
    }

    /**
     * 开启事务
     */
    public void beginTransaction(){
        try {
            cu.getConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 提交事务
     */
    public void commit(){
        try {
            cu.getConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 回滚事务
     */
    public void rollBack(){
        try {
            cu.getConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 关闭连接
     */
    public void release(){
        try {
            cu.getConnection().close();
            cu.removeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
