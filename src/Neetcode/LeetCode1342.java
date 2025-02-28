package Neetcode;


//Given an integer num, return the number of steps to reduce it to zero.
//
//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
public class LeetCode1342 {
    public static int numberOfSteps(int num) {
        int step = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else num--;
            step++;

        }
        System.out.println(step);
        return step;

    }
        public static void main(String[]args){
            numberOfSteps(14);
        }

    }
