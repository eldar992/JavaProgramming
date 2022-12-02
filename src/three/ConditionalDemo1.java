package three;

import java.util.Scanner;

//   && -> USLOVNI AND
//   || -> USLOVNI OR
public class ConditionalDemo1 {
    public static void main(String[] args) {
        System.out.println("Unesi broj bodova sa ispita:");
        double bodovi = new Scanner(System.in).nextDouble();
        System.out.println("Unesi godine:");
        double godine = new Scanner(System.in).nextDouble();
        if (godine >= 18 && bodovi>=4){
            System.out.println("Upisali ste 1. godinu.");
        }else{
            System.out.println("Niste uspjeli upisati fakultet.");
        }if  (godine>18 || bodovi>3){
            System.out.println("Možete ići dalje.");
        }else{
            System.out.println("Izgubili ste mogučnost upisa.");
        }
    }
}
