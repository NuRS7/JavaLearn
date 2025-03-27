package Basics;

public class StringBulderClassRepeating {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World";
        String string3 = string1 +" "+ string2;
        System.out.println(string3);


        StringBuilder string4 = new StringBuilder("Nurs");
        string4.append(4);
        System.out.println(string4.charAt(2));

        String str = "Java one love";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Capacity of StringBuilder is " + sb.capacity());
        sb.ensureCapacity(30);
        System.out.println("Capacity of StringBuilder is " + sb.capacity());

        StringBuffer stringBuffer = new StringBuffer("Java");
        System.out.println(stringBuffer.charAt(3));
        stringBuffer.setCharAt(0, 'K');
        System.out.println(stringBuffer.toString());

    }
}
