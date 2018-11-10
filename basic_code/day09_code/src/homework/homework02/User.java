package homework.homework02;

public class User {
    private int money;
    private String name;

    public User(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public User() {
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println(name+"余额有"+money+"元。");
    }
}
