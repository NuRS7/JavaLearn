package ArrayFromDocsExamples;

public class ArrayCopyDemo2 {
    public static void main(String[] args) {


        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(java.util.Arrays.toString(copyTo));
        for (String coffee : copyTo) {
            System.out.println(coffee);
        }
        String[] copyTO = new String[7];
        System.arraycopy(copyFrom, 2, copyTO, 0, 7);
        System.out.println(java.util.Arrays.toString(copyTO));
    }
}
