package homework;

import java.util.ArrayList;
import java.util.Collections;

public class QuChong {
    public ArrayList<String> qu(ArrayList<String> arr){
        Collections.sort(arr);
//        System.out.println(arr);
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)){
                arr.remove(i);
                i--;
            }
        }
        return arr;
    }
}
