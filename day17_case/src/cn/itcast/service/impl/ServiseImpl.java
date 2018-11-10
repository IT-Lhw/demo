package cn.itcast.service.impl;

import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.domain.User;
import cn.itcast.service.Service;

import java.util.List;

public class ServiseImpl implements Service {
    private UserDaoImpl userDao= new UserDaoImpl();
    @Override
    public List<User> findAll() {
        List<User> users = userDao.findAll();
        return users;
    }

    @Override
    public boolean addUserServlet(User u) {
        return userDao.addUser(u);
    }
}
