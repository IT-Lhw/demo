package com.itheima.utils;

import java.sql.SQLException;

public class TransactionManager {

    private ConnectionUtil cu;

    public final void setCu(ConnectionUtil cu) {
        this.cu = cu;
    }

    /**
     * 开启事务
     */
    public void begin(){
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
     * 释放连接
     */
    public void release(){
        try {
            cu.getConnection().close();
            cu.deleteConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
