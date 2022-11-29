package three;

import java.util.Scanner;

//   && -> USLOVNI AND
//   || -> USLOVNI OR
public class ConditionalDemo1 {

    public static void main(String[] args) {
        System.out.println("Unesi prosjek ocjena korisnika:");
        double ocjena = new Scanner(System.in).nextDouble();
        System.out.println("Unesi godine korisnika:");
        double godine = new Scanner(System.in).nextDouble();
        if (ocjena >= 3.5 && godine>=18){
            System.out.println("Korisnik može upisati 2. godinu.");
        }else {
            System.out.println("Korisnik ne može upisati 2. godinu.");
        }if (ocjena<2 || godine<18){
            System.out.println("Korisnik ima više ispita.");
        }else {
            System.out.println("Korisnik je na regularnim predavanjima.");
        }
    }
}
