package three;

/**
 * 1. String
 * 2. NIZ
 */
public class  ObjectTypeDemo {
    public static void main(String[] args) {
        int number = 23;
        number = 34;
        System.out.println(number);
        System.out.println();

        int [] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 34;
        numbers[2] = 42;
        System.out.println("Indeks 0 čuva vrijednost: "+ numbers[0]);

        String name = new String("Dejla");
        String name1= "Dejla";
        String name2= "Dejla";
        System.out.println(name==name1);
        System.out.println(name1==name2);

        System.out.println(name.equals(name1));
        System.out.println(name1.equals(name2));
    }
}
