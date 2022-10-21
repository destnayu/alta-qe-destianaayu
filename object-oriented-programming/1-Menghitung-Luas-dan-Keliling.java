import java.util.Scanner;

class MenghitungLuasdanKeliling {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        Persegi p=new Persegi();
        Segitiga s=new Segitiga();
        PersegiPanjang pp=new PersegiPanjang();

        System.out.println("Persegi");
        System.out.print("Input Sisi Persegi: ");
        p.sisi=input.nextInt();
        System.out.println("Luas Persegi " +p.getLuasPersegi());
        System.out.println("Keliling Persegi " +p.getKelilingPersegi());
        System.out.println("");
        System.out.println("Segitiga");
        System.out.print("Input Alas: ");
        s.a=input.nextFloat();
        System.out.print("Input Tinggi: ");
        s.t=input.nextFloat();
        System.out.print("Input Sisi 1: ");
        s.s1=input.nextFloat();
        System.out.print("Input Sisi 2: ");
        s.s2=input.nextFloat();
        System.out.print("Input Sisi 3: ");
        s.s3=input.nextFloat();
        System.out.println("Luas Segitiga " +s.getLuasSegitiga());
        System.out.println("Keliling Segitiga "+s.getKelilingSegitiga());
        System.out.println("");
        System.out.println("Persegi Panjang");
        System.out.print("Input Panjang: ");
        pp.panjang=input.nextInt();
        System.out.print("Input Lebar: ");
        pp.lebar=input.nextInt();
        System.out.println("Luas Persegi Panjang " +pp.getLuasPP());
        System.out.println("Keliling Persegi Panjang " +pp.getKelilingPP());

    }
}