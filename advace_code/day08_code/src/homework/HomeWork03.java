package homework;

import java.io.File;
import java.io.IOException;

/**
 * 键盘录入一个文件夹路径，删除该文件夹以及文件夹路径下的所有文件。
 * 要求：录入的文件夹里面要有多个文件，不能包含有子文件夹。
 * 提示：如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。
 */

public class HomeWork03 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\课堂截图\\504");
//        boolean newFile = file.createNewFile();
//        file.delete();
//        file.mkdir();
//        boolean newFile = file.createNewFile();
        mathod(file);
    }

    private static void mathod(File file) {
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                files[i].delete();
            }
            file.delete();
        }
    }
}
