public class missingChar {
    public String missingChar(String str, int n) {
        String result = "";
        if(n>0){
            result = str.substring(0,n);
        }

        result = result + str.substring(n+1);
        return result;
    }

    //missingChar("kitten", 1) → "ktten"
    //missingChar("kitten", 0) → "itten"
    //missingChar("kitten", 4) → "kittn"
    public static void main(String[]args){
        missingChar missing = new missingChar();
        System.out.println(missing.missingChar("kitten", 1));
        System.out.println(missing.missingChar("kitten", 0));
        System.out.println(missing.missingChar("kitten", 4));
    }

}
