public class count7 {
    public int count7(int n) {
        if(n==0){
            return 0;
        }else if(n%10==7){
            return 1 + count7(n/10);
        }else{
            return count7(n/10);
        }
    }

    //count7(717) → 2
    //count7(7) → 1
    //count7(123) → 0
    public static void main(String[]args){
        count7 count = new count7();
        System.out.println(count.count7(717));
        System.out.println(count.count7(7));
        System.out.println(count.count7(123));
    }
}
