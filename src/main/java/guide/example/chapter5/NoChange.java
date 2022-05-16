package guide.example.chapter5;

public class NoChange {
    public static void main(String[] args) {
        // for each loop is essentially read-only
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int x : nums){
            System.out.print(x + " ");
            x = x * 10; // no effect on nums
        }
        System.out.println();

        for (int x : nums)
            System.out.print(x + " ");

        System.out.println();
    }

}
