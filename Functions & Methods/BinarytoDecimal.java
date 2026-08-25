public class BinarytoDecimal {
    // binary to dec yaad hona chahiye kuch ka toh.

    public static void BintoDec (int n ){
        int dec = 0;
        int pow = 0;

        while (n >0 ){
            int lastDigit = n %10;
            dec = dec + (lastDigit * (int)Math.pow(2,pow));
            pow ++;
            n/=10;
        }
        System.out.println(dec);
    }
    public static void main (String args[]){
        BintoDec(101);
    }
}
