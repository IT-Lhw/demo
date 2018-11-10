package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

public interface ServiceUser {
    List serviceUser();
    boolean addServiceUser(User u);
    int delUserDao(String q);
}
