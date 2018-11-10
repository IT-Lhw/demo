package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    boolean addUser(User u);
}
