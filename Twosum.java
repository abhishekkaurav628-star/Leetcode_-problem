public class Twosum {
    public static void main(String[] args) {
        int nums[] = { 2, 5, 8, 3 };
        int target = 5;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){

                if (nums[i] + nums[j] == target) {

                    System.out.println("total two sum: " + nums[i] + ", " + nums[j]);

                }

        }
        

    }
}
}