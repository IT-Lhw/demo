package working;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Fan {
    public static void main(String[] args) throws Exception {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("d.str"));
        ArrayList<String> p = (ArrayList<String>) o.readObject();
        System.out.println(p);
    }
}
