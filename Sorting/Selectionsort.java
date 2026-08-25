import java.util.*;

public class Selectionsort {
    public static void selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int small = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[small] > arr[j]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev= i-1;

            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void Printarr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,4,1,5,2};

        // sorting inbuilt func 
        Arrays.sort(arr);
        Printarr(arr);
    }
}
