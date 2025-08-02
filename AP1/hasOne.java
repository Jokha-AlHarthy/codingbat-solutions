public class hasOne {
    public boolean hasOne(int n) {
        while(n>0){
            if(n%10==1){
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    //hasOne(10) → true
    //hasOne(22) → false
    //hasOne(220) → false
    public static void main(String[]args){
        hasOne one = new hasOne();
        System.out.println(one.hasOne(10));
        System.out.println(one.hasOne(22));
        System.out.println(one.hasOne(220));
    }
}
