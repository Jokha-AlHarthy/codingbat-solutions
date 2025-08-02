public class endX {
    public String endX(String str) {
        if (str.length() == 0) {
            return "";
        }

        char first = str.charAt(0);
        String rest = endX(str.substring(1));
        if(first == 'x'){
            return rest + 'x';
        }else{
            return first + rest;
        }
    }

    //endX("xxre") → "rexx"
    //endX("xxhixx") → "hixxxx"
    //endX("xhixhix") → "hihixxx"
    public static void main(String[]args){
        endX x = new endX();
        System.out.println(x.endX("xxre"));
        System.out.println(x.endX("xxhixx"));
        System.out.println(x.endX("xhixhix"));
    }
}
