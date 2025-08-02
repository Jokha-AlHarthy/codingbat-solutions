public class delDel {
    public String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }else{
            return str;
        }
    }

    //delDel("adelbc") → "abc"
    //delDel("adelHello") → "aHello"
    //delDel("adedbc") → "adedbc"
    public static void main(String[]args){
        delDel delete = new delDel();
        System.out.println(delete.delDel("adelbc"));
        System.out.println(delete.delDel("adelHello"));
        System.out.println(delete.delDel("adedbc"));
    }
}
