package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {
    private ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    private AccountService as = (AccountService) ac.getBean("accountService");
    @Test
    public void findNameIdTest(){
        Account account = as.findByName("bbb");
        System.out.println(account);
    }
    @Test
    public void transferTest(){
        as.transfer("aaa","bbb" ,100f );
    }
}
