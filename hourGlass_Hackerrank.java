import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int sum = 0, max = -100; 
        for(int i = 0;i < 4; i++){
            for(int j = 0;j < 4;j++){
                sum = 0;
                for(int k = i; k < i+3; k++){
                    sum += arr[j][k];
                    if(k == i+1){
                        sum += arr[j+1][k];
                    }
                    sum += arr[j+2][k];
                }
                if(sum > max){
                    max = sum;
                    sum = 0;
                }
            }
        }
        System.out.println(max);
        scanner.close();
    }
}
