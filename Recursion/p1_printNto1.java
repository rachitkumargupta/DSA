public class p1_printNto1 {
    public static void printDec(int n){
        if (n==1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if (n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
        
    }

    public static int fact(int n){
        if (n == 0){
            return 1;
        }
        int fn = n * fact(n-1);
        return fn;
    }

    public static int sumNatural(int n){
        if (n == 1){
            return 1;
        }
        int sum1 = sumNatural(n-1);
        int sum = n + sum1;
        return sum;
    }

    public static int febonacci(int n){
        if (n == 0) {
            return n;
        }
        if (n==1){
            return n;
        }
        int febm1 = febonacci(n-1);
        int febm2 = febonacci(n-2);
        int feb = febm1 + febm2;
        return feb;
    }

    public static boolean isSorted(int[] arr , int i ){
        if (i == arr.length-1){
            return true;
        }
        if (arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOcc(int[] arr, int key , int i ){
        if(arr[i] == key){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }
        return firstOcc(arr, key, i+1);
    }

    // public static int lastOcc(int arr[], int key, int i){

    // }

    public static int powxn(int x, int n){
        if (n == 0){
            return 1;
        }
        int pow = x * powxn(x, n-1);
        return pow;
    }

    public static int powxnopt(int x, int n){
        if (n == 0){
            return 1;
        }
        int half = powxnopt(x, n/2);
        int halfsq = half * half;

        if(n % 2 != 0){
            halfsq = x * halfsq;
        }
        return halfsq;
    }

    // remove duplicates in a string 
    // jo string bane usme se sare duplicate ko hatana 
    // isme ham sirf a-z walo ki baat kr rhe hai , 26 char . toh ek array lelenge jo 26size ka hoga 0-25 toh har char ko - 'a' karenge toh index aajyegi 
    // then uske baad vo array ko boolean banayenge toh if found first time then true aur agr true pehle se toh duplicate 
    // toh new string builder me add mt kro 

    public static void dup(String dup, int ind, StringBuilder newstr, boolean map[]){
        if (ind == dup.length()){
            System.out.println(newstr);
            return;
        } 

        char curr = dup.charAt(ind);
        if (map[curr - 'a'] == true){
            dup(dup, ind+1, newstr, map);
        } else {
            map[curr - 'a'] = true;
            dup(dup, ind+1, newstr.append(curr), map);
        }
    }

    public static void BinaryString(String str , int n){
        if (n == 0 || n == 1){
            return;
        }
        

    }    

    public static void main(String[] args){
        int n = 5;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(sumNatural(n));
        // System.out.println(febonacci(n));

        // int[] arr = {1,2,3,4,6,5};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOcc(arr, 4, 0));
        // System.out.println(powxn(2, 10));
        // System.out.println(powxnopt(2, 11));
        
        String str = "helloooo";
        dup(str, 0, new StringBuilder(""), new boolean[26]);
        System.out.println(1%9);
        System.out.println(3%9);
        System.out.println(5%9);
        System.out.println(6%9);
        System.out.println(7%9);
        System.out.println(8%9);
        System.out.println(9%9);

    }
}
