public class E7 {
    public static void main(String[] args) {
        int a = 50;
        int b = 25;
        String a_element = Integer.toBinaryString(a);
        String b_element = Integer.toBinaryString(b);
        System.out.println("a element: " + a_element + " b element " + b_element);
        String binaryString = Integer.toBinaryString(a & b);
        System.out.println("a & b   = " + binaryString);
        System.out.println("a  =" + (++a));
    }
}
