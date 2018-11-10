package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccounService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service(value = "accountService")
public class AccountServiceImpl implements IAccounService {
    //@Autowired
    //@Qualifier("accountDao2")
    @Resource(name = "accountDao1")
    private IAccountDao accountDao = null;

    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
