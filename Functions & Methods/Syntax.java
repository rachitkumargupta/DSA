import java.util.*;
public class Syntax {

    public static void printHello() {
        System.out.println("Hello");
    }

    // syntax with parameters

    public static void calculateSum(int num1 , int num2){   // parameter or format parameter
        int sum = num1 + num2;
        System.out.println(sum);

    }

    public static void main(String args[]){
        printHello(); // function call

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        calculateSum(a , b);  // arguments or actual parameter


    }
}

// there are two type of parameter , 
// formal parameters and actual parameters 
// formal :jo likhne ke liye likhi hai 
// actual : actual value jo pass hui , jisme kaam hua hai 

// what happens in memory , if any function comes ?
// it actually behaves like a stack , call stack me arrange hote hai func

/*
CALL BY VALUE 
java me call by value kya hota hai?
java me call by value ka mtlb hai ki agr koi value main function se kisi dusre func me pas hoti hai 
toh vo actual value nhi jati , uski copy jati hai 

jaise jb tak vo dusra func chalega tb tk uski value rahegi 
baki phir kahatm hojyegi 

jaise func change a hai , aur usme a = 10 horaha 
but main func me int a = 5; likha hai , phir func call hua 
phir sout kia toh 5 hi print hoga kyuki main me a ki 5 hi rahgei 
*/

/*
CALL BY REFERENCE
jisme original value pass krte h 
JAVA ke andar sare call by value hi hote..
*/




