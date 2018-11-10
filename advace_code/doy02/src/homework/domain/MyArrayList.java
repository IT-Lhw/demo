package homework.domain;

public class MyArrayList<T> implements MyList<T> {
    private Object[] arr = new Object[5];
    private int index;

    @Override
    public void add(T t) {
        if (index == arr.length) {
            System.arraycopy(arr, 0, arr, 0, arr.length * 2);
        }
        arr[index] = t;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public T get(int index) {
        return (T) arr[index];
    }

    @Override
    public boolean remove(T t) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                System.arraycopy(arr, i + 1, arr, i, index - i - 1);
                arr[--index] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(T t) {
        for (int i = 0; i < index; i++) {
            if (arr[i].equals(t)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        index = 0;
    }

    @Override
    public boolean isEmpty() {

        return index == 0;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < index; i++) {
            str = str + arr[i];
            if (i < index - 1) {
                str += ",";
            }
        }
        str += "]";
        return str;
    }
}
