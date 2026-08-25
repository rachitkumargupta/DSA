public class question {

    // count no. of lowercase vowel occured in string
    public static int countlower(String str){
        int count =0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main (String args[]){
        String vowel = "atyuoeihjou";
        System.out.println(countlower(vowel));
    }
}
