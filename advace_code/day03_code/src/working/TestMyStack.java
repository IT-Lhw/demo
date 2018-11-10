package working;

public class TestMyStack {
    public static void main(String[] args) {
        MyStsck<String> stsck = new MyStsck<>();
        stsck.add("天");
        stsck.add("天");
        stsck.add("向");
        stsck.add("上");
        System.out.println(stsck);
//        Object str =stsck.get();
//        System.out.println(str);
//        System.out.println(stsck);
        stsck.getAll();
        System.out.println(stsck);
    }
}
