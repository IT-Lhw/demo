package com.itheima.service.impl;

import com.itheima.service.AccountService;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public void saveAccount() {
//        int i = 1/0;
        System.out.println("保存方法执行了。");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("更新方法执行了"+i);
    }

    @Override
    public int deleteAccount() {
        System.out.println("删除方法执行了。");
        return 0;
    }
}
