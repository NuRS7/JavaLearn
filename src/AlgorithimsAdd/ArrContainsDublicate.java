package AlgorithimsAdd;

class ArrContainsDublicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1 ,2,3,4,4, 6};
        for (int i = 0; i<nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i]== nums[j]){
                    System.out.println(true);
                }
            }
        }

    }

}