package guide.example.chapter5.array;

public class ArrayErr {
    public static void main(String[] args) {
        int[] sample = new int[10];
        int i;
        // generate an array overrun
        for (i = 0; i < 100; i++) {
            sample[i] = i;
        }
    }
}

