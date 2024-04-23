import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r;
        int 𝛼;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz :");
        𝛼 = input.nextInt();

        double alan  = (pi * (r*r) * 𝛼) / 360;
        System.out.println ("Daire diliminin alanı :" + alan);


    }
}