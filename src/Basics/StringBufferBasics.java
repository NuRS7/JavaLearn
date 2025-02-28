package Basics;

import java.lang.StringBuffer;
public class StringBufferBasics {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(50);// 50 capacity
        StringBuffer sb3 = new StringBuffer();
        StringBuffer sb1 = new StringBuffer("Hello World");
        sb1.setLength(3); //Hel
        System.out.println(sb1);

        System.out.println(sb1.length());

        String str = "Java";
        StringBuffer sb4 = new StringBuffer(str);
        sb4.ensureCapacity(32); //changing minimumCapacity from 16 to --> 32
        System.out.println(sb4.capacity()); //16-->32--> reserve 42
        System.out.println(sb4.toString()); //we are use method "toString" --> Java

        StringBuffer sb5 = new StringBuffer("word");
        sb5.insert(3, "l");
        System.out.println(sb5.toString()); //world
        sb5.append("Kazakhstan"); //worldKazakhstan
        sb5.replace(5, 5, " ");//world Kazakhstan
        String str1 = sb5.substring(6, 16); //Kazakhstan
        sb5.replace(0, 5, "Java"); //Java Kazakhstan
//        sb5.reverse(); //natshkazaK avaJ
        sb5.delete(0, 5); //Java deleted finally Kazakhstan
        System.out.println(sb5.charAt(0)); //K
        sb5.setCharAt(0, 'J'); //Jazakhstan
        System.out.println(sb5);
        System.out.println(str1);

    }
}
//StringBuffer — это изменяемый (mutable) класс в Java, предназначенный для работы со строками.
// В отличие от String, объекты StringBuffer можно изменять без создания новых объектов в памяти.
// Это делает его более эффективным при частых операциях над строками, таких как конкатенация.

//StringBuffer является потокобезопасным, так как использует synchronized для синхронизации методов. Это делает его подходящим для многопоточных приложений, но снижает производительность.
//StringBuilder не имеет синхронизации, поэтому работает быстрее, но не гарантирует безопасность в многопоточной среде. Он лучше подходит для однопоточных приложений.

