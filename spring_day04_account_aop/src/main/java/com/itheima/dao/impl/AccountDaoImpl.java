package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.utils.ConnectionUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

/**
 * 账户的持久层实现类
 */
public class AccountDaoImpl implements IAccountDao {

    private QueryRunner runner;
    private ConnectionUtils cu;

    public void setCu(ConnectionUtils cu) {
        this.cu = cu;
    }

    public void setRunner(QueryRunner runner) {

        this.runner = runner;
    }

    @Override
    public List<Account> findAllAccount() {
        try{
            return runner.query(cu.getConnection(),"select * from account",new BeanListHandler<Account>(Account.class));
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Account findAccountById(Integer accountId) {
        try{
            return runner.query(cu.getConnection(),"select * from account where id = ? ",new BeanHandler<Account>(Account.class),accountId);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveAccount(Account account) {
        try{
            runner.update(cu.getConnection(),"insert into account(name,money)values(?,?)",account.getName(),account.getMoney());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateAccount(Account account) {
        try{
            runner.update(cu.getConnection(),"update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteAccount(Integer accountId) {
        try{
            runner.update(cu.getConnection(),"delete from account where id=?",accountId);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 根据用户名查询
     *
     * @param accountName
     * @return
     */
    @Override
    public Account findAccountByName(String accountName) {
        try{
            List<Account> accounts = runner.query(cu.getConnection(),"select * from account where name=?",new BeanListHandler<Account>(Account.class),accountName);
            if (accounts == null || accounts.size() == 0){
                return null;
            }
            if (accounts.size()>1){
                throw new RuntimeException();
            }
            return accounts.get(0);
        }catch (Exception e) {
            throw new RuntimeException("结果集不唯一,数据有问题");
        }
    }
}
