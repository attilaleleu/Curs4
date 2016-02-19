/**
 * Created by leleluattila on 14/12/15.
 */
public class Liste {
    int v;
    Liste next;

    public static void main(String[] args){
        Liste n1 = new Liste();
        Liste n2 = new Liste();
        Liste n3 = new Liste();

        n1.v =4;
        n2.v =6;
        n3.v =3;

        n1.next = n2;
        n2.next = n3;

        System.out.println(n1);
        System.out.println(n3);
    }
}
