package com.itheima.service;

import com.itheima.domain.Account;

public interface AccountService {
    /**
     * 根据名字查询
     */
    Account findByName(String name);
    /**
     * 转账
     */
    void transfer(String sourceName,String targetName,Float money);
}
