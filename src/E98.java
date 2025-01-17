import java.util.*;

public class E98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int max = 0;
        String[] arr = input.split(" ");
        for (String num : arr) {


        }
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if (num > max) {
                max = num;
            }

        }
        System.out.print(max);
        }


    }
