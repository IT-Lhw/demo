package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

public interface Service {
    List<User> findAll();
    boolean addUserServlet(User u);
}
