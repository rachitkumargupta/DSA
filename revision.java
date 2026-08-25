import java.util.*;
public class revision {
    public static void printSubarray(int number[]){
        int ts = 0;
        int sumarr[] = new int[15];
        int n=0;

        for (int i=0; i<number.length ; i++){
            int start=i;
            for (int j=i; j<number.length ; j++){
                int end = j;
                int sum = 0;

                for (int k = start; k <= end ; k++){
                    sum += number[k];
                }
                System.out.println("sum of subarray"+ sum);
                ts++;
                sumarr[n] = sum;
                n++;
            }
            System.out.println();
        }
        System.out.println("sum of array is ");
        for ( int m=0; m<sumarr.length ; m++){
            System.out.print(sumarr[m]);
        }
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5};
        printSubarray(number);
    }
}

