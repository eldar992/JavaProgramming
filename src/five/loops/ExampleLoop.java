package five.loops;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *
 *
 */
public class ExampleLoop {
    public static void main(String[] args) {
        //deklaracija potrebnih varijabli
        int velicinaNiza = 0;
        int[] pogresniUnosi = new int[velicinaNiza];
        while (true) {
            System.out.println("Unesi peticu i zapocni igricu..");
            int number = new Scanner(System.in).nextInt();
            if (number == 5) {
                System.out.println("Unio si peticu i poceo si igricu");
                break;
            } else {
                velicinaNiza++;
                pogresniUnosi = Arrays.copyOfRange(pogresniUnosi, 0, velicinaNiza);
                pogresniUnosi[velicinaNiza-1] = number;

                String porukaKorisniku = "Unio si ";
                for (int pogresanUnos : pogresniUnosi) {
                    porukaKorisniku = porukaKorisniku + pogresanUnos + ",";
                }
                porukaKorisniku= porukaKorisniku+" a petice niđe";
                System.out.println(porukaKorisniku);
            }
        }
    }
}
