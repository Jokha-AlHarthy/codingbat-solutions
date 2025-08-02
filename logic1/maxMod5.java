public class maxMod5 {
    public int maxMod5(int a, int b) {
        if(a==b){
            return 0;
        }else if(a%5 == b%5){
            return Math.min(a,b);
        }else{
            return Math.max(a,b);
        }
    }

    //maxMod5(2, 3) → 3
    //maxMod5(6, 2) → 6
    //maxMod5(3, 2) → 3
    public static void main(String[]args){
        maxMod5 num = new maxMod5();
        System.out.println(num.maxMod5(2, 3));
        System.out.println(num.maxMod5(6, 2));
        System.out.println(num.maxMod5(3, 2));

    }
}
