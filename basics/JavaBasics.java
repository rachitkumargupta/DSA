import java.util.*;

public class JavaBasics {
    public static void main(String arg[]){
        // System.out.print("****\n***\n**\n*");

        // int a = 10;
        // int b = 5;
        // System.out.println(a);
        // System.out.println(b);
        // String name = "Tony Stark";
        // System.out.println(name);


        // a = b;
        // System.out.println(a);
        
        // every data type has diff size
         
        // byte b = 8;
        // System.out.println(b);
        // char ch = 'a';
        // System.out.println(ch);
        // boolean var = false;
        // float price = 10.5;
        // int number = 25;
        // // long
        // // double
        // short n = 240;

        // int a = 10;
        // int b = 20;
        // int sum = a+b;
        // System.out.println(sum);

        // inputs in java

        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        // .next is used where we want to capture a word , sc ya kuch hi rakh sakte ho 
        // scnanner :: ka kam 

        // String name = sc.nextLine();
        // this will include the full line , full sentence can be printed
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);

        // for float it is sc.nextFloat();
        // next , nextLine , nextByte , nextBoolean , nextShort , nextDouble() , nextLong()
        // do some from your own

        // stackover flow very good site for finding the sol for the errors 
        // hath per maro karo , sab sekha jate hai

        /*
        // sum of 2 no 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        */

        /*
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
        // by java if we or not defining every decimal is treated as double and float cant do it so we got a error 
        // so for this , to overcome it we write f after the value to make it float 

        */
        
        /*
        // type conversion
        // it is also called widening conversion or implicit conversion 

        // apne se bade me convert krna
        
        long a =25;
        int b = a;
        System.out.println(b);
        // it is a lossy conversion , java cant do it 

        */

        /*
        // type casting 
        // it is also called explicit conversion or narrowing conversion

        float a = 25.9999f;
        // int b = a; // error lossy conversion 
        int b = (int) a;
        System.out.println(b);
        // isme round of nhi hota 

        char ch ='a';
        int number = ch ;
        System.out.println(number);

        */


        // type promotion
        // alag alag datatype h toh kya hoga 

        // short a =5;
        // byte b =25;
        // char c = 'c';
        // byte bt = (byte)(a+b+c);

        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // int ans = a+b+c+d;
        // System.out.println(ans);

        // chote walo ko int me convert like byter short or char
        // long , float , double then inhi me se kisi me convert hojyega jo sbse bada ho 

        byte b = 5;
        // byte a = b*2; // error hia ye exp hai toh java ne promote krke int ban adiya 
        // System.out.println(a);

        byte a = (byte)(b*2);
        System.out.println(a);
        // logicaly pehle wale glt nhi h but java me tyoe promotion hota hai toh pehle wala galat dedega 
        
        
        




        

        
    }
}
