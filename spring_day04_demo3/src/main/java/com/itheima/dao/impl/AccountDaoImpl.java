package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private QueryRunner runner = null;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    private Connection connection;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /**
     * 根据id查询
     */
    public Account findById(Integer id) {
        List<Account> accounts = null;
        try {
            accounts = runner.query(connection,"select * from account where id = ?",new BeanListHandler<Account>(Account.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts.isEmpty()?null:accounts.get(0);
    }
    /**
     * 根据名字查询
     */
    public Account findByName(String name) {
        List<Account> accounts = null;
        try {
            accounts = runner.query(connection,"select * from account where name = ?",new BeanListHandler<Account>(Account.class),name);
            if (accounts.size()>1){
                throw new RuntimeException("结果集不唯一");
            }if (accounts.size()==0 || accounts == null){
                return null;
            }
            return accounts.get(0);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 更新数据
     */
    public void update(Account account) {
        try {
            runner.update(connection,"update account set name = ?,money = ? where id = ?",account.getName(),account.getMoney(),account.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
