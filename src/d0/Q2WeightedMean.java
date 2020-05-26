package d0;

import java.util.Scanner;

public class Q2WeightedMean {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        int len = Integer.parseInt(in.nextLine());

        String x = in.nextLine();
        String[] strX = x.split(" ");
        String w = in.nextLine();
        String[] strW = w.split(" ");

        long[] numX = new long[strX.length];
        long[] numW = new long[strW.length];
        double totalNumber = 0;
        double totalWeight = 0;

        for(int i=0; i < strX.length; i++){
            totalNumber = totalNumber + Long.parseLong(strX[i]) * Long.parseLong(strW[i]);
            totalWeight = totalWeight + Long.parseLong(strW[i]);
        }

        System.out.printf("%.1f", totalNumber/totalWeight);
    }
}
