package JavaLearnNModel;

import java.util.Scanner;

public class N79 {
    public static void main(String[] args) {
        String text = "Как мы уже убедились, в Java есть очень полезный оператор";
        Scanner sc = new Scanner(text);
        String check = sc.findInLine("J\\w+");
        System.out.println(check);
    }
}
