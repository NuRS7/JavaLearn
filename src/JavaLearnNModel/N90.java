package JavaLearnNModel;

public class N90 {
    public static void main(String[] args) {
        int[] arrayList = new int[10];
        int i = 0;
        while (i < 10) {
            arrayList[i] = i;
            i++;
        }
        i = 0;
        while (i < 10) {
            System.out.println((i + 1) + ": элемент " +  arrayList[i]);
            i++;

        }





    }
}
