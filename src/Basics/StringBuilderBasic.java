package Basics;

public class StringBuilderBasic {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(50); //вместимость
        StringBuilder sb3 = new StringBuilder("Good day Nurs!");
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb3.length());
        System.out.println(sb4.length());
        System.out.println(sb3.charAt(3));
        System.out.println(sb3.indexOf("Nurs"));
        System.out.println(sb3.indexOf("u", 3));

        StringBuilder sb5 = new StringBuilder("True:");
        sb5.append(true);
        System.out.println(sb5.toString());


    }
}
