public class makeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int maxBigBarsUsed = Math.min(big, goal / 5);
        int remaining = goal - maxBigBarsUsed * 5;
        if(small >= remaining){
            return remaining;
        }else{
            return -1;
        }
    }

    //makeChocolate(4, 1, 9) → 4
    //makeChocolate(4, 1, 10) → -1
    //makeChocolate(4, 1, 7) → 2
    public static void main(String[]args){
        makeChocolate chocolate = new makeChocolate();
        System.out.println(chocolate.makeChocolate(4, 1, 9));
        System.out.println(chocolate.makeChocolate(4, 1, 10));
        System.out.println(chocolate.makeChocolate(4, 1, 7));
    }
}
