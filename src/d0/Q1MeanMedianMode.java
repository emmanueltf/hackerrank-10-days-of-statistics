package d0;

import java.util.Arrays;
import java.util.Scanner;

public class Q1MeanMedianMode {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        // Go to next line
        in.nextLine();
        String input = in.nextLine();
        String[] str = input.split(" ");
        // Transform string to long numbers
        long[] num = new long[str.length];
        for(int i=0; i < num.length; i++){
            num[i] = Long.parseLong(str[i]);
        }

        meanMedianMode(num);
    }

    private static void meanMedianMode(long[] arrItems){

        double sum = 0;
        double median = 0;
        double mean;
        double mode = -1;
        double oldNumber = -1;
        int qtd = 0;
        int maxQtd = 0;

        Arrays.sort(arrItems);

        if(arrItems.length%2 == 1){
            median = arrItems[(arrItems.length/2)];
        } else {
            double m1 = arrItems[(arrItems.length/2)];
            double m2 = arrItems[(arrItems.length/2) - 1];
            median = (m1+m2)/2;
        }

        for(int i =0; i < arrItems.length; i++){
            if(arrItems[i] == oldNumber){
                qtd++;
            } else {
                qtd = 1;
            }
            if(qtd > maxQtd){
                maxQtd = qtd;
                mode = arrItems[i];
            }
            oldNumber = arrItems[i];
            sum = sum + arrItems[i];
        }

        mean = sum / arrItems.length;

        System.out.printf("%.1f\n", mean);
        System.out.printf("%.1f\n", median);
        System.out.printf("%.0f\n", mode);

    }
}
