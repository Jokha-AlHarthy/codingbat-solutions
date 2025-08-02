public class old35 {
    public boolean old35(int n) {
        boolean mod3 = (n % 3 == 0);
        boolean mod5 = (n % 5 == 0);
        if(mod3 && mod5){
            return false;
        }else if(mod3 || mod5){
            return true;
        }else{
            return false;
        }
    }

    //old35(3) → true
    //old35(10) → true
    //old35(15) → false
    public static void main(String[]args){
        old35 old = new old35();
        System.out.println(old.old35(3));
        System.out.println(old.old35(10));
        System.out.println(old.old35(15));
    }
}
