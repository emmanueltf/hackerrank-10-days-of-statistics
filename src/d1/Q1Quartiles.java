package d1;

import java.util.Arrays;
import java.util.Scanner;

public class Q1Quartiles {

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

        quartiles(numbers, n);

    }

    private static void quartiles(int[] numbers, int length){

        int q1,q2,q3;
        int index_q2 = length/2;
        int index_q1 = index_q2/2;
        int index_q3 = index_q1 + index_q2;
        Arrays.sort(numbers);
        if(length%2 == 0){
            q2 = (numbers[index_q2-1] + numbers[index_q2])/2;
            if(index_q2%2 == 0){
                q1 = (numbers[index_q1-1] + numbers[index_q1])/2;
                q3 = (numbers[index_q3-1] + numbers[index_q3])/2;
            } else {
                q1 = numbers[index_q1];
                q3 = numbers[index_q3];
            }
        } else {
            q2 = numbers[index_q2];
            q1 = (numbers[index_q1] + numbers[index_q1-1])/2;
            q3 = (numbers[index_q3] + numbers[index_q3+1])/2;
        }

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);

    }

}
