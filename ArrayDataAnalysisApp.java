import java.util.Scanner;

public class ArrayDataAnalysisApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- 1. Single-Dimensional Array ----------
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ---------- 2. Operations ----------
        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }

        double average = (double) sum / n;

        // ---------- 3. Manual Sorting (Bubble Sort) ----------
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // ---------- 4. Multi-Dimensional Array ----------
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // ---------- 5. Exception Handling ----------
        try {
            System.out.println("\nAccessing invalid index: " + arr[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nException Caught: Array index is out of bounds!");
        }

        // ---------- 6 & 7. Output ----------
        System.out.println("\n====== Array Data Analysis ======");
        System.out.printf("Sum       : %d%n", sum);
        System.out.printf("Average   : %.2f%n", average);
        System.out.printf("Maximum   : %d%n", max);
        System.out.printf("Minimum   : %d%n", min);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // ---------- Display 2D Array ----------
        System.out.println("\n\n2D Array Output:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
