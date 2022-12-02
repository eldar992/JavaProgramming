package six.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HugoDemo {
    public static void main(String[] args) {

        System.out.println("Unesi peticu i započni igricu");
        int velicinaNiza= 0;
        int [] pogresniBrojevi = new int[velicinaNiza];

        while (true) {
            int number = new Scanner(System.in).nextInt();
            if (number == 5) {
                System.out.println("Unio si peticu i počeo si igricu");
                break;
            } else {
                velicinaNiza++;
                pogresniBrojevi = Arrays.copyOfRange(pogresniBrojevi,0,velicinaNiza);
                pogresniBrojevi[velicinaNiza-1]=number;
                String porukaKorisniku = "Unio si ";
                for (int pogresanUnos : pogresniBrojevi) {
                    porukaKorisniku = porukaKorisniku + pogresanUnos + ",";
                }
                porukaKorisniku= porukaKorisniku+" a petice niđe";
                System.out.println(porukaKorisniku);
            }
        }
    }
}
