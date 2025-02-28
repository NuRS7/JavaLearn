package E_Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E93 {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = reader.readLine();
        }
        reader.close();
        for (String name : names) {
            System.out.println("Hello, " + name);
        }
    }
}
