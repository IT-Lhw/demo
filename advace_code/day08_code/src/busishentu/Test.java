package busishentu;

/**
 * 现有一对刚出生的兔子
 * 1:小兔1个月长成大兔
 * 2：一对大兔一个月制造一对小兔
 * 3:24个月后会有多少兔子？
 *
 */

public class Test {
    public static void main(String[] args) {
        int a = mathod(24);
        System.out.println("有"+a*2+"只兔子");
    }

    private static int  mathod( int moth) {
        if (moth<3){
            return 1;
        }
        return mathod(moth-1)+mathod(moth-2);
    }

}
