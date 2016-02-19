package exemplu.lectia4.test1;


public class Robot {
    //*** ATRIBUTE ***
    //se recomanda a face atributele private
    private int x;
    private int y;
    private String nume;

    public Robot(){

    }

    public Robot(int x, int y, String nume) {
        this.x = x;
        this.y = y;
        this.nume = nume;
    }

    // deplasare pe x
    public void deplasareX(int n){
        if (x  + n < 100)
            x = x + n;
    }

    // deplasare y
    public void deplasareY(){
        if (y < 100)
            y = y + 1;
    }

    // deplasare xy
    public void deplasareXY(int n){
        deplasareY();
        deplasareX(n);
    }




    public String toString(){
        return "Robot:" +nume+ " Pozitia: x = " +x+" y = " +y;
    }
}
