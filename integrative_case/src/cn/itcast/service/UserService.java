package cn.itcast.service;

import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;

import java.util.List;

public interface UserService {

    User selectDao(User user);

    List UserDao();

    int addUserDao(User user);

    void deleteUser(String id);

    User findUser(String id);

    void updateUser(User user);

    void delSelectUser(String[] ids);

    PageBean<User> findUserByPage(String rows, String currentPage);
}
