public class lastTwo {
    public String lastTwo(String str) {
        if(str.length() == 0){
            return str;
        }else if(str.length()==1){
            return str;
        }else{
            String start = str.substring(0,str.length()-2);
            String swapped = str.charAt(str.length()-1) + "" + str.charAt(str.length()-2);
            return start + swapped;
        }
    }

    //lastTwo("coding") → "codign"
    //lastTwo("cat") → "cta"
    //lastTwo("ab") → "ba
    public static void main(String[]args){
        lastTwo last = new lastTwo();
        System.out.println(last.lastTwo("coding"));
        System.out.println(last.lastTwo("cat"));
        System.out.println(last.lastTwo("ab"));
    }
}
