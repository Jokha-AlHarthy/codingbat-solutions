public class nearHundred {
    public boolean nearHundred(int n) {
        if((n>= 90 && n <=110) || (n>=190 && n <= 210)){
            return true;
        }else{
            return false;
        }
    }

    //nearHundred(93) → true
    //nearHundred(90) → true
    //nearHundred(89) → false

    public static void main(String[]args){
        nearHundred near = new nearHundred();
        System.out.println(near.nearHundred(93));
        System.out.println(near.nearHundred(90));
        System.out.println(near.nearHundred(89));
    }


}
