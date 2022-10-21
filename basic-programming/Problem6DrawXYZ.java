import java.util.Scanner;

public class Problem6DrawXYZ {
    private static void DrawXYZ(int n){
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        n = input.nextInt();

        tampil(n);
    }

    public static void  tampil(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("Y");
            for (int j = i; j < n; j++) {
                System.out.print("Y");
            }

            for (int j = i; j > 0; j--) {
                if (j % 2 == 0) {
                    System.out.print("Z");
                }
            }
            for (int x = 3; x < n; x+=3) {
                if (x % 5 != 0) {
                    System.out.print("X");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        DrawXYZ(3);
    }
}
