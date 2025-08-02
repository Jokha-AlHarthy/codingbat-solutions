public class close10 {
    public int close10(int a, int b) {
        int nearA = Math.abs(a-10);
        int nearB = Math.abs(b-10);

        if(nearA < nearB){
            return a;
        }else if(nearB < nearA){
            return b;
        }else{
            return 0;
        }
    }

    //close10(8, 13) → 8
    //close10(13, 8) → 8
    //close10(13, 7) → 0
    public static void main(String[]args){
        close10 close = new close10();
        System.out.println(close.close10(8, 13));
        System.out.println(close.close10(13, 8));
        System.out.println(close.close10(13, 7));
    }

}
