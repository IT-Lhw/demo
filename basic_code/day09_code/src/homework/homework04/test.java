package homework.homework04;

public class test {

    public static void main(String[] args) {

        JingLI jing = new JingLI();
        jing.setMoney(20000);
        jing.setJiangJin(6000);
        jing.setName("项目经理");
        jing.setWorkNum(54321);
        chengxuyuan cheng = new chengxuyuan();
        cheng.setMoney(15000);
        cheng.setName("程序猿");
        cheng.setWorkNum(12345);
        System.out.println("职位："+jing.getName()+"。工资："+jing.getMoney()+"。奖金："+jing.getJiangJin()+"。工号为："+jing.getWorkNum());
        jing.work();

        System.out.println("职位："+cheng.getName()+"。工资："+cheng.getMoney()+"。工号为："+cheng.getWorkNum());
        cheng.work();

    }

}
