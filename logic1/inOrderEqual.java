public class inOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if(equalOk){
            if(a <= b && b <= c){
                return true;
            }else{
                return false;
            }
        }else{
            if(a < b && b < c){
                return true;
            }else{
                return false;
            }
        }
    }

    //inOrderEqual(2, 5, 11, false) → true
    //inOrderEqual(5, 7, 6, false) → false
    //inOrderEqual(5, 5, 7, true) → true
    public static void main(String[]args){
        inOrderEqual order = new inOrderEqual();
        System.out.println(order.inOrderEqual(2, 5, 11, false));
        System.out.println(order.inOrderEqual(5, 7, 6, false));
        System.out.println(order.inOrderEqual(5, 5, 7, true));
    }
}
