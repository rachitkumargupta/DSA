import java.util.*;
public class Que {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of times ");
        int no = sc.nextInt();
        int counter = 1;

        while (counter <= no){
            System.out.print(counter + " ");
            counter++;
        }
    }
}
