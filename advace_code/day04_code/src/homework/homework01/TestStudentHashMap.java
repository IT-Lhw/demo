package homework.homework01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestStudentHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Student> map = new LinkedHashMap<>();
        map.put("熊大",new Student(14,"太原五龙口") );
        map.put("熊二", new Student(12,"太原小店"));
        map.put("光头强",new Student(26,"大同") );
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue().getAge()+"岁,"+entry.getValue().getDiZhi());
        }
    }
}
