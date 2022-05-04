package guide.example.chapter5.array;

public class MinMax{
    public static void main(String[] args) {
        int[] nums = new int[10];
        int min, max;

        nums[0]=99;
        nums[1]=-11;
        nums[2]=18813;
        nums[3]=44;
        nums[4]=-677;
        nums[5]=9392;
        nums[6]=491;
        nums[7]=-22;
        nums[8]=306;
        nums[9]=35;

        min=max=nums[0];
        for (int i = 0; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("min and max: " + min + " " + max);
    }
}
