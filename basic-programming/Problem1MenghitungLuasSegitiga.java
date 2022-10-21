import java.util.Scanner;

public class Problem1MenghitungLuasSegitiga {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        float a,t,L ;

        System.out.print("Input Alas: ");
        a = input.nextFloat();
        System.out.print("Input Tinggi: ");
        t = input.nextFloat();

        L= (a*t/2);

//        System.out.println ("Alas   ="+a);
//        System.out.println ("Tinggi ="+t);
        System.out.println ("Luas   ="+L);
        }

}
