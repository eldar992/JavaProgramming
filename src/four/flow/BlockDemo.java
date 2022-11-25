package four.flow;

import java.util.Scanner;

/**
 * Pustim korisnika da u konzoli unese broj godina.
 * Program provjerava punoljetnost korisnika konzumirajući njegov unos godina.
 */
public class BlockDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj godina:");
        int brojGodina = new Scanner(System.in).nextInt();
        boolean uslovZaPunoljetnost = brojGodina >=18;
        if (uslovZaPunoljetnost){
            System.out.println("Korisnik je punoljetan.");
        }else {
            System.out.println("Korisnik nije punoljetan.");
        }
    }
}
