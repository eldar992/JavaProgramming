package five.array;

/**
 * Prvi složeni tip podatka:
 * <li> 1. niz</li>
 */
public class ArrayConstructionDemo {
    public static void main(String[] args) {
        int number = 23;
        number = 34;
        number = 44;
        System.out.println(number);

        //čuvati sve ove brojeve iznad bez da izgubim brojeve iza
        // Deklaracija niza : Tip i Ime

        /**
         * 1. način
         * 1.1 alokacija ili zauzimanje prostora
         * 1.2 dodjela tom prostoru vrijednosti
         */
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 34;
        numbers[2] = 44;

        for (int n: numbers){
            System.out.print(n+ " ,  ");
        }




    }
}
