package working;

import java.util.LinkedList;

public class MyStsck<E> {
    private LinkedList<E> list = new LinkedList<>();
    public void add(Object obj){
        list.add((E) obj);
    }
    public Object get (){
        return list.removeLast();
    }

    public void getAll(){
        int num = list.size();
        for (int i = 0; i < num; i++) {
//            System.out.println(i);
            System.out.println(list.removeLast());
        }
    }

    @Override
    public String toString() {
        return "MyStsck{" +
                "list=" + list +
                '}';
    }
}
