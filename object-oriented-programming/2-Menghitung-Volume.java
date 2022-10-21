import java.util.Scanner;

class MenghitungVolume {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        Volume v=new Volume();

        System.out.println("Kubus");
        System.out.print("Input Sisi Kubus: ");
        v.sisi=input.nextInt();
        System.out.println("Volume Kubus: " +v.VolumeKubus());
        System.out.println();
        System.out.println("Balok");
        System.out.print("Input Panjang: ");
        v.panjang=input.nextInt();
        System.out.print("Input Lebar: ");
        v.lebar=input.nextInt();
        System.out.print("Input Tinggi: ");
        v.tinggi=input.nextInt();
        System.out.println("Volume Balok: " +v.VolumeBalok());
        System.out.println();
        System.out.println("Tabung");
        System.out.print("Input Jari-Jari: ");
        v.r=input.nextInt();
        System.out.print("Input Tinggi: ");
        v.t=input.nextInt();
        System.out.println("Volume Tabung: " +v.VolumeTabung());
    }
}