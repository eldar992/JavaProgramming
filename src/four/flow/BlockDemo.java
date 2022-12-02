package four.flow;

import java.util.Scanner;

/**
 * Pustim korisnika da u konzoli unese broj godina.
 * Program provjerava punoljetnost korisnika konzumirajući njegov unos godina.
 */
public class BlockDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj godina korisnika:");
        int godine = new Scanner(System.in).nextInt();
        if (godine >=18){
            System.out.println("Korisnik je punoljetan.");
        }else{
            System.out.println("Korisnik nije punoljetan.");
        }
    }
}
