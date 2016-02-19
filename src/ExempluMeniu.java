import java.util.Scanner;

public class ExempluMeniu {

    void actiune1(){
        System.out.println("Executa actiune 1");
    }
    void actiune2(){
        System.out.println("Executa actiune 2");
    }
    void actiune3(){
        System.out.println("Executa actiune 3");
    }
    void actiune4(){
        System.out.println("May the FORCE be with you!");
    }

    void meniu(){

        Scanner k = new Scanner(System.in);
        int i;
        do{
            System.out.println("Alege Optiunea: ");
            System.out.println("1 - actiunea 1");
            System.out.println("2 - actiunea 2");
            System.out.println("3 - actiunea 3");
            System.out.println("4 - parasire program");
            i = k.nextInt();

            switch (i){
                case 1: actiune1();
                    break;
                case 2: actiune2();
                    break;
                case 3: actiune3();
                    break;
                default: actiune4();

            }

            if (i>4){
                System.out.println("Unknown command.");
            }

        }while(i!=4);

    }
    public static void main(String[] args){
        ExempluMeniu m = new ExempluMeniu();
        m.meniu();
    }
}