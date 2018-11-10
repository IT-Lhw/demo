package working.working03;

public class Test {
//    public static void main(String[] args) {
//        MyThread my = new MyThread();
//        my.start();
//        for(int i = 0;i<100;i++){
//            System.out.println("main:"+i);
//        }
//
//    }
public static void main(String[] args){
    int[] arr = null;
    printArr(arr);
}
    public static void printArr(int[] arr) throws NullPointerException{
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
