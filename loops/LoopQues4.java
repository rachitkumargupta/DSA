import java.util.*;
public class LoopQues4 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int no = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(no + "*" + i + "=" + no*i);
        }
    }
}
