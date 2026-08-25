public class BinomialCoeff {
    public static int fact (int a ){
        int fac = 1;
        for (int i=1 ; i<=a ; i++){
            fac*=i;
        } 
        return fac;
    }

    public static int binCoeff (int n , int r){
        int bc = fact(n) / (fact(r) * (fact(n-r)));
        System.out.println(bc);
        return bc;
    }

    public static void main (String args[]){
        binCoeff(5,2);
    }
}


