package homework.homework04;

public abstract class ZhiYuan {
    private String name;
    private int workNum;
    private int money;
    public abstract void work();

    public ZhiYuan(String name, int workNum, int money) {
        this.name = name;
        this.workNum = workNum;
        this.money = money;
    }

    public ZhiYuan() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkNum() {
        return workNum;
    }

    public void setWorkNum(int workNum) {
        this.workNum = workNum;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
