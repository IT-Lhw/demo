package com.itheima.ui;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client1 {


    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        IAccountService as1  = (IAccountService)ac.getBean("accountService");
//        IAccountDao accountDao = ac.getBean("accountDao2", IAccountDao.class);
        System.out.println(as1);
//        System.out.println(accountDao);
        IAccountService as  = (IAccountService)ac.getBean("accountService");
        System.out.println(as);
        as.saveAccount();
  }
}
