package cn.itcast.dao;

import java.util.List;

public interface UserDao<T> {
    List<T> findAll();
}
