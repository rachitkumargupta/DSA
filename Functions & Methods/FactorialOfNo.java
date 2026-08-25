public class FactorialOfNo {
    public static int fact (int a ){
        int fac = 1;
        for (int i=1 ; i<=a ; i++){
            fac*=i;
        } 
        System.out.println(fac);
        return fac;
    }

    public static void main (String args[]){
        fact(4);
    }
}
