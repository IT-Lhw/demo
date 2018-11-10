package cn.itcast.service.impl;

import cn.itcast.dao.LoginDao;
import cn.itcast.dao.impl.LoginDaoImpl;
import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private LoginDao dao = new LoginDaoImpl();
    @Override
    public User selectDao(User user) {
        return dao.selectDao(user);
    }

    @Override
    public List UserDao() {
        return dao.UserDao();
    }
    @Override
    public int addUserDao(User user) {
        return dao.addUserDao(user);
    }

    @Override
    public void deleteUser(String id) {
        dao.deleteUser(Integer.parseInt(id));
    }

    @Override
    public User findUser(String id) {
        return dao.findUser(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    public void delSelectUser(String[] ids) {
        for (String id : ids) {
            dao.deleteUser(Integer.parseInt(id));
        }
    }

    @Override
    public PageBean<User> findUserByPage(String _rows, String _currentPage) {
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);

        System.out.println("判断前currentPage:"+currentPage);
//        创建一个空的pageBean对象
        PageBean<User> pb = new PageBean<>();

        pb.setRows(rows);
//        调用dao中的方法，获取数据总数
        int totalCount = dao.getTotalCount();
        System.out.println("总数据："+totalCount);

        //        计算从第几条数据开始查询
        int start = (currentPage-1)*rows;

        System.out.println("判断前start:"+start);

//        判断所查页码是否存有数据，若无，则自动跳转到上一页
        if (start == totalCount){
//            判断当前页码是否为第一页，若是，则不进行跳转
            if (start==0){

            }else {
                currentPage = currentPage-1;
                start = (currentPage-1)*rows;
            }
        }

        System.out.println("判断后start:"+start);
        System.out.println("判断后currentPage:"+currentPage);



        //        将方法中的两个参数设置到pb中
        pb.setCurrentPage(currentPage);
//        将数据总数添加到pb对象中
        pb.setTotalCount(totalCount);

//        调用dao中的方法，获取List集合
        List<User> list = dao.getList(start,rows);
//        将list集合添加到pb对象中
        pb.setList(list);
//        计算总页数
        int totalPage = totalCount%rows == 0 ? totalCount/rows:(totalCount/rows+1);
//        将总页数设置到pb对象中
        pb.setTotalPage(totalPage);
        return pb;
    }

//    public static void main(String[] args) {
//        UserServiceImpl service = new UserServiceImpl();
//        PageBean<User> userByPage = service.findUserByPage("2", "5");
//        System.out.println(userByPage);
//    }
}
