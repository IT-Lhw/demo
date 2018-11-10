package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    //根据id查询
    public Account findAccountById(Integer id) {
        List<Account> accounts = template.query("select * from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), id);
        return accounts.isEmpty()?null:accounts.get(0);
    }
    //根据名字查询
    public Account findAccountByName(String name) {
        List<Account> accounts = template.query("select * from account where name = ?", new BeanPropertyRowMapper<Account>(Account.class), name);
        if (accounts.size()>1){
            throw new RuntimeException("结果集不唯一");
        }if (accounts == null || accounts.size() == 0){
            return null;
        }
        return accounts.get(0);
    }
    //查询所有
    public List<Account> findAll() {
        List<Account> accounts = template.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        return accounts;
    }
    //更新数据
    public void updateAccount(Account account) {
        template.update("update account set name=?,money=? where id = ?", account.getName(),account.getMoney(),account.getId());
    }
}
