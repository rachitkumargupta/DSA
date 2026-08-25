public class InvertedStar {
    public static void main (String args[]){

/*
        for (int line = 4; line >=1; line--){
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/

// logic ye hai ki line n hai toh..
// n-i+1 (yeh hai logic)

        int n = 4;
        for(int i=1;i<=n;i++){
            for(int s =1; s<=(n-i+1);s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}