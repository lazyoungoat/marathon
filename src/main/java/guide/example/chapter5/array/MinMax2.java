package guide.example.chapter5.array;

public class MinMax2 {
    public static void main(String[] args) {
        int min, max;


        int[] nums = {99, -11, 18813, 44, -677, 9392, 491, -22, 306, 35};


        min=max=nums[0];
        for (int i = 0; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("min and max: " + min + ", " + max);
    }
}
