package five.array;

import com.sun.source.tree.BinaryTree;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Unesite broj.
 * Unesite broj.
 * Unesite broj...
 *  -> mi ubacimo u neki niz brojeva.
 */
public class ArrayBasicExampleDemo {
    public static void main(String[] args) {
        int[] number = new int[3];
        System.out.println("Unesi prvi broj:");
        number[0] = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj:");
        number[1] = new Scanner(System.in).nextInt();
        System.out.println("Unesi treći broj:");
        number[2] = new Scanner(System.in).nextInt();

        for (int brojevi : number){
            System.out.println(brojevi);
        }
    }
}
