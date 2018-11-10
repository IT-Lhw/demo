package working.demo01;

import java.sql.SQLOutput;

public class Body {
    public class Heart{
        public void beat(){
            System.out.println("内部类的方法执行");
        }
    }
    public void methodBody(){
        System.out.println("外部类的方法执行");
        new Heart().beat();
    }
}
