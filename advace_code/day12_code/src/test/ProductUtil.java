package test;

import java.util.List;
import java.util.function.Predicate;

public class ProductUtil {
    /**
     * 传入一堆商品，把满足条件的进行筛选并且打印到控制台
     */
    public static void printProduct(List<Product> products, Predicate<Product> predicate){
        for (Product product : products) {
            if(predicate.test(product)){
                System.out.println(product);
            }
        }
    }
}
