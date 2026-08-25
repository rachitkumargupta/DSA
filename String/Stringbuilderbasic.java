public class Stringbuilderbasic{

    // conerting first leter to uppercase of the string 
    public static String firstletterupper (String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // string compression
    public static String stringcompression (String str){
        StringBuilder sb = new StringBuilder("");

        for (int i=0; i<str.length(); i++){
            sb.append(str.charAt(i));

            Integer count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            if(count >1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        
        for (char ch ='a'; ch<='z' ; ch++){
            sb.append(ch);
        }  
        // System.out.println(sb);

        // first letter upper case 
        String uppercase = "hello my name is rachit";
        System.out.println(firstletterupper(uppercase));

        // string compression
        String decompressed = "aaabbcccdd";
        System.out.println(stringcompression(decompressed));
    }    
}
