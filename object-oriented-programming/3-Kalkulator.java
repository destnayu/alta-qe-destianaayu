import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Kalkulator {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
        Operasi op = new Operasi();
        int pilihan;
        String pilih = "Y";
        int i = 0;

        System.out.println("============Kalkulator============");
        while (pilih.equals("Y") || pilih.equals("y")) {
        System.out.println("\n1. Penjumlahan \n2. Penggurangan \n3. Perkalian \n4. Pembagian");
        System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.println("\nPenjumlahan");
                System.out.print("Input Nilai 1: ");
                op.n1 = input.nextInt();
                System.out.print("Input Nilai 2: ");
                op.n2 = input.nextInt();
                op.getPenjumlahan();
                System.out.println("\nIngin Menghitung Lagi?");
                System.out.print("[Y/T] [y/t]: ");
                try {
                    pilih = input2.readLine();
                } catch (IOException e) {
                    System.out.println("Gagal");
                }
                i++;
            } else if (pilihan == 2) {
                System.out.println("\nPengurangan");
                System.out.print("Input Nilai 1: ");
                op.n1 = input.nextInt();
                System.out.print("Input Nilai 2: ");
                op.n2 = input.nextInt();
                op.getPengurangan();
                System.out.println("\nIngin Menghitung Lagi?");
                System.out.print("[Y/T] [y/t]: ");
                try {
                    pilih = input2.readLine();
                } catch (IOException e) {
                    System.out.println("Gagal");
                }
                i++;
            } else if (pilihan == 3) {
                System.out.println("\nPerkalian");
                System.out.print("Input Nilai 1: ");
                op.n1 = input.nextInt();
                System.out.print("Input Nilai 2: ");
                op.n2 = input.nextInt();
                op.getPerkalian();
                System.out.println("\nIngin Menghitung Lagi?");
                System.out.print("[Y/T] [y/t]: ");
                try {
                    pilih = input2.readLine();
                } catch (IOException e) {
                    System.out.println("Gagal");
                }
                i++;
            } else if (pilihan == 4) {
                System.out.println("\nPembagian");
                System.out.print("Input Nilai 1: ");
                op.n1 = input.nextInt();
                System.out.print("Input Nilai 2: ");
                op.n2 = input.nextInt();
                op.getPembagian();
                System.out.println("\nIngin Menghitung Lagi?");
                System.out.print("[Y/T] [y/t]: ");
                try {
                    pilih = input2.readLine();
                } catch (IOException e) {
                    System.out.println("Gagal");
                }
                i++;
            }
        }
    }
}