package test05;

import java.sql.SQLOutput;

public class Star extends Category {
    public Star() {
    }

    @Override
    public void woek() {
        System.out.println("编号为"+id+"的"+category+"类演员"+name+"在演电视剧");
    }
}
