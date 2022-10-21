import java.util.Scanner;

public class Problem3FaktorBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        System.out.print("Input: ");
        bilangan = input.nextInt();

        for(int i=1; i<=bilangan; i++){
            if(bilangan%i==0){
                System.out.println(i);
            }
        }
    }
}

