package homework.homework;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private String name;
    private int age;
    private String man;

    public Student() {
    }

    public Student(String name, int age, String man) {
        this.name = name;
        this.age = age;
        this.man = man;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(man, student.man);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, man);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", man='" + man + '\'' +
                '}';
    }
}
