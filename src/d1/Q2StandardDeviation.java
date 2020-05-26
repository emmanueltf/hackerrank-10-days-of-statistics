package d1;

import java.util.Scanner;

public class Q2StandardDeviation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = Integer.parseInt(scanner.nextLine());
        String[] arrItems = scanner.nextLine().split(" ");
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            numbers[i] = arrItem;
        }

        starndardDeviation(numbers, n);

    }

    public static void starndardDeviation(int[] numbers, int length){

        double sum = 0;
        double mean = 0;
        double variance = 0;
        double sd = 0;

        for (int i: numbers) {
            sum += i;
        }
        mean = sum / length;

        for (int i: numbers) {
            variance += Math.pow(i - mean, 2);
        }
        variance = variance/length;

        sd = Math.sqrt(variance);

        System.out.printf("%.1f", sd);

    }
}
