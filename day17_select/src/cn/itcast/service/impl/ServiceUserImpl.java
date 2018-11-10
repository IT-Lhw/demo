package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoIml;
import cn.itcast.domain.User;
import cn.itcast.service.ServiceUser;

import java.util.List;

public class ServiceUserImpl implements ServiceUser {
    private UserDao ud=new UserDaoIml();
    @Override
    public List serviceUser() {
        return ud.userDao();
    }

    @Override
    public boolean addServiceUser(User u) {
        return ud.addUserDao(u);
    }

    @Override
    public int delUserDao(String q) {
        int i = ud.delUserDao(q);
        return i;
    }
}
