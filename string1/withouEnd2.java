public class withouEnd2 {
    public String withouEnd2(String str) {
        if(str.length() <=2){
            return "";
        }else{
            return str.substring(1,str.length()-1);
        }
    }

    //withouEnd2("Hello") → "ell"
    //withouEnd2("abc") → "b"
    //withouEnd2("ab") → ""
    public static void main(String[]args){
        withouEnd2 end = new withouEnd2();
        System.out.println(end.withouEnd2("Hello"));
        System.out.println(end.withouEnd2("abc"));
        System.out.println(end.withouEnd2("ab"));
    }
}
