public class StringisPalindrome {
    public static boolean palindrome (String name){
        for(int i=0 ; i<name.length()/2 ; i++){
            if(name.charAt(i) != name.charAt(name.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void shortestpath(String destination){
        int i=0 , j=0;
        for(int k=0; k<destination.length(); k++){
            if(destination.charAt(k) == 'w'){
                i-=1;
            }
            else if(destination.charAt(k) == 'e'){
                i+=1;
            }
            else if(destination.charAt(k) == 'n'){
                j+=1;
            }
            else {
                j-=1;
            }
        }
        int s= (int)((Math.pow(i-0,2)) + (Math.pow(j-0,2)));
        float path = (float)Math.sqrt(s);
        System.out.println(i + " " + j);
        System.out.println(path);
    }


    // code of printing the substring from string 
    public static String substring (String str , int si , int ei){
        String substr = "";
        for (int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    // given set of string , print the largest String
    public static void largestString (String str[]){
        String largest = str[0];

        for (int i=1; i<str.length; i++){
            if(largest.compareTo(str[i]) < 0){
            largest = str[i];
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        String name = "racecar";
        String destination = "nsew";
        System.out.println(palindrome(name));
        shortestpath(destination);
        System.out.println(substring(name, 0, 4));

        // java also has a method to use substring 
        System.out.println(name.substring(0,5));

        String fruits[] = {"apple ", "mango", "banana"};
        largestString(fruits);
    }
}    
