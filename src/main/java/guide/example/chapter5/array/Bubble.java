package guide.example.chapter5.array;

public class Bubble {
    public static void main(String[] args) {
        int[] nums = {99, -11, 18813, 44, -677, 9392, 491, -22, 306, 35};

        int a, b, t;
        int size;

        size = 10; // number of elements to sort
        // display original array
        System.out.print("Original array is:");

        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        // This is th Bubble sort.
        for (a = 1; a < size; a++) {
            for (b = size-1; b >= a; b--) {
                if (nums[b-1] > nums[b]){// if out of order
                    // exchange elements
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        //display sorted array
        System.out.print("Sorted array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }

    }
}
