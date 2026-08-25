import java.util.*;
public class LoopQues2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

/*
        System.out.println("enter no");
        int n = sc.nextInt();
        int lastDigit = 0;
        int even = 0;
        int odd = 0;

        while(n>0){
            lastDigit = n%10;
            if(lastDigit %2 == 0){
                even += lastDigit;
            } else {
                odd += lastDigit;
            }
            lastDigit/= 10;
        }

        System.out.println("sum of even integers is " + even );
        System.out.println("sum of odd integers is " + odd );
    }
}

// nhi chala ye code 

*/

        int n;
        int choice;
        int even = 0;
        int odd = 0;

        do {
            System.out.println("enter a no");
            n = sc.nextInt();
            if(n%2==0){
                even += n;
            }else {
                odd += n;
            }
            System.out.println("press 1 if want to continue ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("sum of even no is "+ even );
        System.out.println("sum of odd no is "+ odd);
    }
}