public class LearnMathIf {
    public static void main(String[] args) {


    }

    public static double parameter(double lenghtA, double lenghtB, String name) {
        double result;
        if (name != null) {
            if (lenghtA > 0 && lenghtB > 0) {
                result = 2 * (lenghtA + lenghtB);
            } else {
                return -1;

            }
        }
         else    {
            throw new IllegalArgumentException("Wrong" + name);
        }
        return result;

    }


}