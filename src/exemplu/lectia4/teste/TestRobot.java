package exemplu.lectia4.teste;
import exemplu.lectia4.test1.Robot;

public class TestRobot {
    public static void main(String[] args){
        Robot r1 = new Robot();
        Robot r2 = new Robot(10, 10, " Robot Alpha");
        Robot r3 = new Robot(15, 35, " Robot Beta");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        r2.deplasareX(24);
        System.out.println(r2);


    }

}
