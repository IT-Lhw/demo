package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountDao {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Account findAccountById(Integer id);
    /**
     * 根据名字查询
     */
    Account findAccountByName(String name);
    /**
     * 查询所有
     */
    List<Account> findAll();
    /**
     * 更新账户
     */
    void updateAccount(Account account);
}
