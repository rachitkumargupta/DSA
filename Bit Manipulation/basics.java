import java.util.*;

public class basics {

    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even no");
        } else {
            System.out.println("odd no");
        }
    }

    public static void getIthBit (int n , int i){
        int bitMask = 1<<i;
        if ((n & bitMask) ==0){
            System.out.println("ith no is 0");
        } else {
            System.out.println("ith no is 1");
        }
    }

    // set Ith bit or make the ith bit 1
    public static int setIthBit (int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    // clear the ith bit or make the Ith bit 0
    public static int clearIthBit (int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;  
    }

    // clear last i bits 
    public static int clearLast (int n, int i){
        int bitMask = (~0)<<i ;
        return n & bitMask;
    }

    // clear range of bits , jo bhi uss range ke bich ho unhe clear kardo (0 banado)
    public static int clearRange (int n , int i , int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    // if a no is a power of 2 or not 
    // agr power of 2 hai toh :- uske aur uske prev no ka & = 0 hoga
    public static boolean powerOf2(int n){
        /*
        if((n & (n-1)) == 0){
            return true;
        } else {
            return false;
        }
        // bakwas code
        */

        return (n&(n-1)) == 0;
    }

    // count set bits in a no, ek no me total kitte 1 hai..
    public static int countSetBits(int n){
        int count = 0;
        while (n>0){
            if((n&1)==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    // fast exponentiation
    public static int fastExponentiation (int n, int k){
        int exp = 1;
        while(k>0){
            if((k&1)!=0){
                exp*=n;
            }
            n*=n;
            k=k>>1;
        }
        return exp;
    }
    
    public static void main (String args[]){

        // basic operations of bit
        /*
        System.out.println((5&6));
        System.out.println((5|6));
        System.out.println((5^6));
        System.out.println(~0);
        System.out.println(5<<2);
        System.out.println(6>>1);
        */

        oddOrEven(3);
        getIthBit(10, 2);
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(clearLast(15, 2));
        System.out.println(clearRange(10, 2, 4));
        System.out.println(powerOf2(4));
        System.out.println(countSetBits(10));
        System.out.println(fastExponentiation(3, 5));
    }
}