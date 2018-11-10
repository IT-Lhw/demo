package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("accountDao")
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    public List<Account> findAll() {
        return getJdbcTemplate().query("select * from account ", new BeanPropertyRowMapper<Account>(Account.class));
    }

    public Account findAccountById(Integer id) {
        List<Account> accounts = getJdbcTemplate().query("select * from account where id = ? ", new BeanPropertyRowMapper<Account>(Account.class),id);
        return accounts.isEmpty()?null:accounts.get(0);
    }

    public Account findAccountByName(String name) {
        List<Account> accounts = getJdbcTemplate().query("select * from account where name = ? ", new BeanPropertyRowMapper<Account>(Account.class),name);
        if (accounts.isEmpty()){
            return null;
        }if (accounts.size()>1){
            throw new RuntimeException("结果集不唯一");
        }
        return accounts.get(0);
    }
}
