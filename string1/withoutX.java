public class withoutX {
    public String withoutX(String str) {
        if(str.length() == 0){
            return str;
        }else if(str.length() == 1){
            if(str.charAt(0)=='x'){
                return "";
            }else{
                return str;
            }
        }else{
            boolean startX = str.charAt(0) == 'x';
            boolean endX = str.charAt(str.length()-1) == 'x';

            if(startX && endX){
                return str.substring(1,str.length()-1);
            }else if(startX){
                return str.substring(1);
            }else if(endX){
                return str.substring(0, str.length() -1);
            }else{
                return str;
            }
        }
    }

    //withoutX("xHix") → "Hi"
    //withoutX("xHi") → "Hi"
    //withoutX("Hxix") → "Hxi"
    public static void main(String[]args){
        withoutX without = new withoutX();
        System.out.println(without.withoutX("xHix"));
        System.out.println(without.withoutX("xHi"));
        System.out.println(without.withoutX("Hxix"));
    }
}
