public class nearTen {
    public boolean nearTen(int num) {
        int mod = num % 10;
        if(mod <= 2 || mod >= 8){
            return true;
        }else{
            return false;
        }
    }

    //nearTen(12) → true
    //nearTen(17) → false
    //nearTen(19) → true
    public static void main(String[]args){
        nearTen near = new nearTen();
        System.out.println(near.nearTen(12));
        System.out.println(near.nearTen(17));
        System.out.println(near.nearTen(19));
    }
}
