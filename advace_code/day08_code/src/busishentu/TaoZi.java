package busishentu;

public class TaoZi {
    public static void main(String[] args) {
        System.out.println(mathod(10));
    }

    private static int mathod(int i) {
        if (i==1){
            return 1;
        }
        return (mathod(i-1)+1)*2;
    }
}
