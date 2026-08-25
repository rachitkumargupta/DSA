import java.util.*;
public class LoopQues3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a given no");
        int no = sc.nextInt();
        int fac = 1;
        
        for(int i=no; i>=1;i--){
            fac = fac * i;
        }
        System.out.println("factorial of given no is " + fac);
    }
}
