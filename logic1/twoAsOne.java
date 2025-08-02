public class twoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
        if(a + b == c){
            return true;
        }else if(a + c == b){
            return true;
        }else if(b + c == a){
            return true;
        }else{
            return false;
        }
    }

    //twoAsOne(1, 2, 3) → true
    //twoAsOne(3, 1, 2) → true
    //twoAsOne(3, 2, 2) → false
    public static void main(String[]args){
        twoAsOne as = new twoAsOne();
        System.out.println(as.twoAsOne(1, 2, 3));
        System.out.println(as.twoAsOne(3, 1, 2));
        System.out.println(as.twoAsOne(3, 2, 2));
    }
}
