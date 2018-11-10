package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import com.itheima.utils.TransactionManager;

import java.util.List;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl_OLD implements IAccountService{

    private IAccountDao accountDao;

    //声明一个TransactionManager对象
    private TransactionManager tm;

    public void setTm(TransactionManager tm) {
        this.tm = tm;
    }

    public void setAccountDao(IAccountDao accountDao) {

        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        try {
            //1:开启事务
            tm.beginTransaction();
            //2：执行操作
            List<Account> list = accountDao.findAllAccount();
            //3：提交事务
            tm.commit();
            //4：提交结果
            return list;
        } catch (Exception e) {
            //5：回滚事务
            tm.rollBack();
            throw new RuntimeException();
        }finally {
            //6:释放连接
            tm.release();
        }
    }

    @Override
    public Account findAccountById(Integer accountId) {
        try {
            //1:开启事务
            tm.beginTransaction();
            //2：执行操作
            Account account = accountDao.findAccountById(accountId);
            //3：提交事务
            tm.commit();
            //4：提交结果
            return account;
        } catch (Exception e) {
            //5：回滚事务
            tm.rollBack();
            throw new RuntimeException();
        }finally {
            //6:释放连接
            tm.release();
        }
    }

    @Override
    public void saveAccount(Account account) {
        try {
            //1:开启事务
            tm.beginTransaction();
            //2：执行操作
            accountDao.saveAccount(account);
            //3：提交事务
            tm.commit();
            //4：提交结果
            return;
        } catch (Exception e) {
            //5：回滚事务
            tm.rollBack();
        }finally {
            //6:释放连接
            tm.release();
        }
    }

    @Override
    public void updateAccount(Account account) {
        try {
            //1:开启事务
            tm.beginTransaction();
            //2：执行操作
            accountDao.updateAccount(account);
            //3：提交事务
            tm.commit();
            //4：提交结果
            return;
        } catch (Exception e) {
            //5：回滚事务
            tm.rollBack();
        }finally {
            //6:释放连接
            tm.release();
        }
    }

    @Override
    public void deleteAccount(Integer acccountId) {
        try {
            //1:开启事务
            tm.beginTransaction();
            //2：执行操作
            accountDao.deleteAccount(acccountId);
            //3：提交事务
            tm.commit();
            //4：提交结果
            return;
        } catch (Exception e) {
            //5：回滚事务
            tm.rollBack();
        }finally {
            //6:释放连接
            tm.release();
        }
    }

    /**
     * 转账
     * @param sourceName
     * @param targetName
     * @param money
     */
    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        try {
            //1:开启事务
            tm.beginTransaction();
            //2：执行操作

            //1：根据名称查询转出账户
            Account source = accountDao.findAccountByName(sourceName);
            //2：根据名称查询转入账户
            Account target = accountDao.findAccountByName(targetName);
            //3：转出账户减钱
            source.setMoney(source.getMoney()-money);
            //4：转入账户加钱
            target.setMoney(target.getMoney()+money);
            //5：更新转出账户
            accountDao.updateAccount(target);
            //错误
            int i = 1/0;
            //6：更新转入账户
            accountDao.updateAccount(source);

            //3：提交事务
            tm.commit();
            //4：提交结果
            return;
        } catch (Exception e) {
            //5：回滚事务
            tm.rollBack();
            throw new RuntimeException("service层出现错误");
        }finally {
            //6:释放连接
            tm.release();
        }
    }
}
