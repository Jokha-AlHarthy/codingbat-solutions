public class startOz {
    public String startOz(String str){
        String result = "";
        if(str.length() >= 2 && str.charAt(0) == 'o' && str.charAt(1) == 'z'){
            result = "oz";
        }else if(str.length() >= 1 && str.charAt(0) == 'o'){
            result = "o";
        }else if(str.length() >= 2 && str.charAt(1) == 'z'){
            result = "z";
        }else{
            result = "";
        }
        return result;
    }

    //startOz("ozymandias") → "oz"
    //startOz("bzoo") → "z"
    //startOz("oxx") → "o"
    public static void main(String[]args){
        startOz start = new startOz();
        System.out.println(start.startOz("ozymandias"));
        System.out.println(start.startOz("bzoo"));
        System.out.println(start.startOz("oxx"));
    }

}
