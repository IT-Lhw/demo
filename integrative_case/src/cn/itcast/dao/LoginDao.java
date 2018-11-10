package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

public interface LoginDao {
    User selectDao(User user);
    List UserDao();
    int addUserDao(User user);
    void deleteUser(int id);

    User findUser(int id);

    void updateUser(User user);

    int getTotalCount();

    List<User> getList(int start, int rows);
}
