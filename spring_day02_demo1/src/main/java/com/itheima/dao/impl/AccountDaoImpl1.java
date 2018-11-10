package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao1")
public class AccountDaoImpl1 implements IAccountDao {
    public void saveAccount() {
        System.out.println("数据保存了1111");
    }
}
