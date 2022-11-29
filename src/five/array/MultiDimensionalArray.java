package five.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //[] prve uglaste zagrade govore da se radi o nizu
        //[][] druge uglaste zagrade govore da je svaki element tog niza ponovno novi niz
        String[][] fullNames = new String[30][2];
        fullNames[0][0] = "Ivica";
        fullNames[0][1] = "Stanić";

        fullNames[5][0] = "Anja";
        fullNames[5][1] = "Tešanović";

    }
}
