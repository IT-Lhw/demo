package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoIml implements UserDao {
    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List userDao() {
        String sql = "select *from user ";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<>(User.class));
        return users;
    }

    @Override
    public boolean addUserDao(User u) {
        String sql = "insert  into `user` (`name`,`gender`,`age`,`address`,`qq`,`email`) values (?,?,?,?,?,?)";
        int i = template.update(sql, u.getName(), u.getGender(), u.getAge(), u.getAddress(), u.getQq(), u.getEmail());
        if (i==0){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public int delUserDao(String q) {
        String del = "delete from 'user' where email=?";
        int i = template.update(del, q);
        return i;
    }

}
