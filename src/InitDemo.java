import java.util.Arrays;

public class InitDemo {
    private static char[] alph;
    static { // Статический блок инициализации
        alph = new char[26];
        int i = 0;
        for (char c = 'a'; i < alph.length; i++) {
            alph[i] = c;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(alph));

    }
}
