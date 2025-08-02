public class stringE {
    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='e'){
                count++;
            }
        }
        if(count>=1 && count<=3){
            return true;
        }else{
            return false;
        }
    }

    //stringE("Hello") → true
    //stringE("Heelle") → true
    //stringE("Heelele") → false
    public static void main(String[]args){
        stringE e = new stringE();
        System.out.println(e.stringE("Hello"));
        System.out.println(e.stringE("Heelle"));
        System.out.println(e.stringE("Heelele"));
    }
}
