package JavaLearnNModel;

public class N82 {
    public static void main(String[] args) {
        int h = 1;
        while (h <= 10) {
            int w = 1;
            while (w <= 20) {
                if (h == 1 || h == 10) {
                    System.out.print("Б");
                } else if (w == 1 || w == 20) {
                    System.out.print("Б");
                }
                else {
                    System.out.print(" ");
                }
                w++;
            }
            System.out.println();
            h++;
        }
    }
}


