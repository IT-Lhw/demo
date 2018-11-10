package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;

public class AccountServiceImpl implements AccountService {
    private AccountDao dao;

    public void setDao(AccountDao dao) {
        this.dao = dao;
    }

    /**
     * 根据名字查询
     */
    public Account findByName(String name) {
        return dao.findByName(name);
    }

    /**
     * 转账
     * @param sourceName
     * @param targetName
     * @param money
     */
    public void transfer(String sourceName, String targetName, Float money) {
        //1:根据名字查询
        Account source = dao.findByName(sourceName);
        Account target = dao.findByName(targetName);
        //2：判断返回值是否为空
        if (source != null && target != null){
            //减钱
            source.setMoney(source.getMoney()-money);
            //加钱
            target.setMoney(target.getMoney()+money);
        }
        //更新账户
        dao.update(source);
//        int i = 1/0;
        dao.update(target);
    }
}
