package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao dao;


    public List<Account> findAll() {
        return dao.findAll();
    }

    public Account findAccountById(Integer id) {
        return dao.findAccountById(id);
    }

    public Account findAccountByName(String name) {
        return dao.findAccountByName(name);
    }
}
