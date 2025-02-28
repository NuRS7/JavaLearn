package JavaRush;

public class J32 {
    public static void main(String[] args) {
        int[] newArr;
        newArr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = newArr.length - i;
            System.out.print(newArr[i]+" ");
            System.out.println();
            for (int element : newArr) {
                System.out.print(element+ " ");
            }

        }
    }
}
