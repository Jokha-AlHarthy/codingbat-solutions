public class inOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if(bOk){
            return c > b;
        }else{
            return b > a && c > b;
        }
    }

    //inOrder(1, 2, 4, false) → true
    //inOrder(1, 2, 1, false) → false
    //inOrder(1, 1, 2, true) → true
    public static void main(String[]args){
        inOrder order = new inOrder();
        System.out.println(order.inOrder(1, 2, 4, false));
        System.out.println(order.inOrder(1, 2, 1, false));
        System.out.println(order.inOrder(1, 1, 2, true));
    }
}
