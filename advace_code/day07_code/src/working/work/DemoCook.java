package working.work;

public class DemoCook {
    public static void main(String[] args) {
        // TODO 请在此使用Lambda【标准格式】调用invokeCook方法
        //invokeCook(/*补全此处代码*/);
        invokeCook(() -> {
                    System.out.println("做饭饭；");
                }
        );
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }

}
