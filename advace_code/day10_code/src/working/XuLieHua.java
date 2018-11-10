package working;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class XuLieHua {
    public static void main(String[] args) throws Exception {
//        Person person = new Person("熊大", 6);
//        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("person.obj"));
//        obj.writeObject(person);
//        obj.close();
        ArrayList<String> obj = new ArrayList<>();
        obj.add("张三");
        obj.add("李四");
        obj.add("王五");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d.str"));
        oos.writeObject(obj);
        oos.close();

    }
}
