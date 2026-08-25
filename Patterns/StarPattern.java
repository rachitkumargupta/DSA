import java.util.*;
public class StarPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // loop ke andar loops ko nested loops bolte hai

        for(int line=1; line<=4; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
// row and column technique are used , we have to use two loop where one is for row , and one for column 
