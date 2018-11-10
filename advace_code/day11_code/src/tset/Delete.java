package tset;

import java.io.File;

public class Delete {
    public static void main(String[] args) {
        File file = new File("E:");
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().endsWith(".png")){
                files[i].delete();
            }
        }
    }
}
