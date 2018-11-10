package homework.homework01;

import java.util.Objects;

public class Student {
    private int age;
    private String diZhi;

    public Student() {
    }

    public Student(int age, String diZhi) {
        this.age = age;
        this.diZhi = diZhi;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(diZhi, student.diZhi);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", diZhi='" + diZhi + '\'' +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, diZhi);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiZhi() {
        return diZhi;
    }

    public void setDiZhi(String diZhi) {
        this.diZhi = diZhi;
    }
}
