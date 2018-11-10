package homework.homework04;

public class chengxuyuan extends ZhiYuan {
    @Override
    public void work() {
        System.out.println("程序员正在努力写着代码");
    }

    public chengxuyuan() {
    }

    public chengxuyuan(String name, int workNum, int money) {
        super(name, workNum, money);
    }
}
