package homework.domain;

public interface MyList<E> {
    /**添加*/
    void add(E e);
    int size();
    E get(int index);
    /**删除*/
    boolean remove(E e);
    /**判断是否存在*/
    boolean contains(E e);
    /**清空*/
    void clear();
    /**判断是否为空*/
    boolean isEmpty();
}
