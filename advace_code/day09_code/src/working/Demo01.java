package working;

import java.io.FileInputStream;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream("E:\\IdeaProjects\\advace_code\\day09_code\\src\\working\\a.properties"));
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("age"));
    }
}
