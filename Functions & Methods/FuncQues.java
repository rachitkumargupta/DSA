public class FuncQues {
    public static int AvgofThree (int a , int b , int c ){
        int avg = (a+b+c)/3;
        return avg;
    }

    public static boolean isEven (int n){
        if (n%2==0){
            return true;
        } else {
            return false;}
    }

    public static boolean Palindrome (int n ){
        int no = n;
        int rev = 0;
        while(n !=0){
            int lastDigit = n%10;
            rev = rev *10 + lastDigit;
            n/=10;
        }
        if (rev == no){
            return true;
        } else {
        return false;
        } 
    }

    public static int SumofDigit (int n ){
        int sum = 0;
        while(n != 0){
            int lastDigit = n%10;
            sum+=lastDigit;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {

        // Q1
        System.out.println(AvgofThree(3, 2, 1));

        // Q2
        if (isEven(5)){
            System.out.println("no is even ");
        } else {
            System.out.println("no is odd");
        }

        // Q3
        if (Palindrome(101)){
            System.out.println("it is a palindorme");
        } else {
            System.out.println("it is not a palindorme ");
        }

        // Q4
        System.out.println(SumofDigit(123));
    }
}
