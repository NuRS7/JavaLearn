package E_Model;

class TestDoWhile  {
    public static void main(String[] args) {
        int i = 8;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i > 5 && i < 10);
    }
}