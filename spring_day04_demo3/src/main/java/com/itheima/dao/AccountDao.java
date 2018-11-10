package com.itheima.dao;

import com.itheima.domain.Account;

public interface AccountDao {
    /**
     * 根据id查询
     */
    Account findById(Integer id);
    /**
     * 根据名字查询
     */
    Account findByName(String name);
    /**
     * 更新数据
     */
    void update(Account account);
}
