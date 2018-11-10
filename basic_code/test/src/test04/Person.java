package test04;

public class Person implements MyInterface{
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sleep() {
        System.out.println("休息是人的本能");
    }
}
