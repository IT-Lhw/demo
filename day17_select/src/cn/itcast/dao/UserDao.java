package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

public interface UserDao {
    List userDao();
    boolean addUserDao(User u);
    int delUserDao(String q);
}
