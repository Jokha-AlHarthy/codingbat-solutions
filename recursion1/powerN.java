public class powerN {
    public int powerN(int base, int n) {
        if(n==1){
            return base;
        }else{
            return base * powerN(base, n-1);
        }
    }

    //powerN(3, 1) → 3
    //powerN(3, 2) → 9
    //powerN(3, 3) → 27
    public static void main(String[]args){
        powerN power = new powerN();
        System.out.println(power.powerN(3,1));
        System.out.println(power.powerN(3,2));
        System.out.println(power.powerN(3,2));
    }
}
