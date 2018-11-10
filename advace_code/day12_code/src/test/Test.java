package test;

import java.util.ArrayList;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
//        ArrayList<Product> products = new ArrayList<>();
//        products.add(new Product("房子",255866555 ));
//        products.add(new Product("车子",256688 ));
//        products.add(new Product("冰激凌",23 ));
//        products.add(new Product("收音机", 532));
//        ProductUtil.printProduct(products, (a)->{
//            return a.getPrice()>88888;
//        } );
        Product a = new Product("车子", 22556);
        String b =method(a, (pro)->{
            return pro.toString();
        });
        System.out.println(b);
    }
    public static String method(Product product, Function<Product,String> fun){
        String name = fun.apply(product);
        return name;
    }
}
