public class count8 {
    public int count8(int n) {
        if(n==0){
            return 0;
        }else if(n%10==8){
            if((n / 10) % 10 == 8){
                return 2 + count8(n/10);
            }else{
                return 1 + count8(n/10);
            }
        }else{
            return count8(n/10);
        }
    }

    //count8(8) → 1
    //count8(818) → 2
    //count8(8818) → 4
    public static void main(String[]args){
        count8 count = new count8();
        System.out.println(count.count8(8));
        System.out.println(count.count8(818));
        System.out.println(count.count8(8818));
    }
}
