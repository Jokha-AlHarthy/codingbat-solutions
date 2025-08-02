public class hasTeen {
    public boolean hasTeen(int a, int b, int c) {
        if(a>=13 && a <= 19){
            return true;
        }else if(b>=13 && b<= 19){
            return true;
        }else if(c>=13 && c <= 19){
            return true;
        }else{
            return false;
        }
    }

    //hasTeen(13, 20, 10) → true
    //hasTeen(20, 19, 10) → true
    //hasTeen(20, 10, 13) → true
    public static void main(String[]args){
        hasTeen teen = new hasTeen();
        System.out.println(teen.hasTeen(13, 20, 10));
        System.out.println(teen.hasTeen(20, 19, 10));
        System.out.println(teen.hasTeen(20, 10, 13));
    }

}
