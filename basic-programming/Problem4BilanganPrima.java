import java.util.Scanner;

public class Problem4BilanganPrima {

    private static boolean primeNumber(int number) {
        int hasil = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                hasil++;
            }
        }
        if (hasil == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }

}
