import java.util.*;
public class Smallestno {
    public static int getSmallest(int number[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i < number.length ; i++){
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }    

    public static void main (String[] args){
        int number[] = {1, 2, 5, 10};
        System.out.println("smallest no is " + getSmallest(number));
    }
}


