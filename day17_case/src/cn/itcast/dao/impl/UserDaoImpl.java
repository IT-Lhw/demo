package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<User>  findAll() {
        String sql = "select * from user;";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<>(User.class));
        return users;
    }

    @Override
    public boolean addUser(User u) {
        String sql = "inner into user values(?,?,?,?,?,?)";
        int i = template.update(sql, u.getName(), u.getGender(), u.getAge(), u.getAddress(), u.getQq(), u.getEmail());
        if (i==0){
            return false;
        }else {
            return true;
        }

    }
}
