public class Test {
    public static void main(String[] args) {

        MyArrayList arrayList = new MyArrayList();
        arrayList.add(123);
        arrayList.add("好好学习");
        arrayList.add("天天向上");
        arrayList.add(3.1415926);
        for(int i = 0;i<arrayList.sazi();i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("集合的长度是："+arrayList.sazi());
        arrayList.remove(3);
        System.out.println("删除索引为3的数据之后，集合长度为："+arrayList.sazi());
        for(int i = 0;i<arrayList.sazi();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
