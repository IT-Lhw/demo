package working.demo01;

import working.demo01.Body;

public class Test {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();
        System.out.println("===========");
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
