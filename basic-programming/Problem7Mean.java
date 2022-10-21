import java.util.Scanner;

public class Problem7Mean {

    private static float Mean (float[] numbers){
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Input: ");
        String a =  input.nextLine();
        String[] nilai = a.split(",");
        System.out.println(nilai);

        int n = numbers.length;
        float jumlah = 0;
        for (String i : nilai) {
            float angka = Float.parseFloat(i);
            jumlah = jumlah + angka;
            System.out.println(i);
        }

        return (jumlah / n);

    }

    public static void main(String[] args) {
    float[] value={1, 2, 3, 4};
    System.out.println(Mean(value));
    }
}
