import java.util.Scanner;

public class OngkosKirim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int p, l, t, hasil;
        int i=5000;
        int berat=0;

        System.out.println("Ongkos Kirim");
        System.out.print("Panjang: ");
        p = input.nextInt();
        System.out.print("Lebar: ");
        l=input.nextInt();
        System.out.print("Tinggi: ");
        t=input.nextInt();
        System.out.print("Berat: ");
        berat=input.nextInt();
        if (berat<=1) {
            hasil=berat*i;
            System.out.println("Harga: "+hasil);
        }else  if (berat>=1) {
            hasil=berat*i;
            System.out.println("Harga: "+hasil);
            }
    }
}

