package homework;

import java.util.ArrayList;
import java.util.HashSet;

public class QuChong03 {
    public HashSet<String> qu(ArrayList<String> arr){
        HashSet<String> strings = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            strings.add(arr.get(i));
        }
        return strings;
    }
}
