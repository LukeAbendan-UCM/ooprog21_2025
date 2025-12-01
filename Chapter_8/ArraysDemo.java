import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] array = new int[5];

        display("Original array:", array);

        Arrays.fill(array, 8);
        display("After filling with 8s:", array);

        array[2] = 6;
        array[4] = 3;
        display("After changing two values:", array);

        Arrays.sort(array);
        display("After sorting:", array);
    }

    public static void display(String message, int[] array) {
        System.out.printf("%-30s", message);
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
