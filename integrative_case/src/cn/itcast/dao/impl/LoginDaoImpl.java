package cn.itcast.dao.impl;

import cn.itcast.dao.LoginDao;
import cn.itcast.domain.User;
import cn.itcast.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


public class LoginDaoImpl implements LoginDao {
    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public User selectDao(User user) {
        try {
            String sql = "select * from user where username=? and password=? ";
            User loginUser = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), user.getUsername(), user.getPassword());
            return loginUser;
        } catch (DataAccessException e) {
            return null;
        }
    }

    @Override
    public List UserDao() {
        String sql="select * from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public int addUserDao(User user){
        try {
            System.out.println(user.getUsername());
            String sql = "insert  into `user`(`name`,`gender`,`age`,`address`,`qq`,`email`,`username`,`password`) values (?,?,?,?,?,?,?,?);";
            int i = template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail(), user.getUsername(), user.getPassword());
            return i;
        } catch (DataAccessException e) {
            return 0;
        }
    }

    @Override
    public void deleteUser(int id) {
        String sql = "delete from user where id = ?";
        template.update(sql,id );
    }

    @Override
    public User findUser(int id) {
        String sql = "select * from user where id=?";
        User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),id);
        return user;
    }

    @Override
    public void updateUser(User user) {
        String sql = "update user set name=?,gender=?,age=?,address=?,qq=?,email=? where id=?";
        template.update(sql,user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail(),user.getId());
    }

    @Override
    public int getTotalCount() {
        String sql = "select count(*) from user";
        return template.queryForObject(sql,Integer.class );
    }

    @Override
    public List<User> getList(int start, int rows) {
        String sql = "select * from user limit ?,?";
        List<User> list = template.query(sql, new BeanPropertyRowMapper<User>(User.class), start, rows);
        return list;
    }

//    public static void main(String[] args) {
//        LoginDaoImpl dao = new LoginDaoImpl();
////        List<User> list = dao.getList(1, 3);
////        System.out.println(list);
//        int i = dao.getTotalCount();
//        System.out.println(i);
//    }
}
