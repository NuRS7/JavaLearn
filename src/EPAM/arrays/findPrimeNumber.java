package EPAM.arrays;

public class findPrimeNumber {
    public  static boolean isPrime(int n) {
        if (n<=1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 34, 4, 5, 5, 6};
        for (int i = 0; i<arr.length; i++) {
            if(isPrime(arr[i])) { // i қойса индекциясы бойынша prime сан изделеди егер arr[i] қойсақ массивтегі сандар табылады жай сандар
                System.out.println(arr[i]);
            }
        }

    }
}
