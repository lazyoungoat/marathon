package guide.example.chapter5;

public class ForEach2 {
    public static void main(String[] args) {
        // use for-each style for on a two-dimensional array.
        int sum = 0;
        int[][] nums = new int[3][5];

        // give nums some values
        for (int i = 0; i < 3; i++)
            for (int j=0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);

        // use for-each for loop to display and sum the values.
        for (int [] x : nums){
            for (int y : x){
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
    }
}
