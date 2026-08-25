public class Subarray {
    public static void printSubarray(int numbers[]){
        int ts=0;
        int sumarr[] = new int[15];
        int n=0;
        for(int i = 0; i<numbers.length ; i++){
            int start=i;
            for(int j=i ; j<numbers.length; j++){
                int end =j;
                int sum=0;
                for(int k = start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    sum+=numbers[k];
                }
                ts++;
                System.out.println("sum of sub array is "+ sum);
                sumarr[n] = sum;
                System.out.println(sumarr[n]);
                n++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("sum of array is ");
        for(int m=0; m<=sumarr.length-1 ; m++){
            System.out.print(sumarr[m] +" ");
        }
        System.out.println("total subarrays are " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarray(numbers);
    }
}
