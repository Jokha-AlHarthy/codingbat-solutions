public class blackjack {
    public int blackjack(int a, int b) {
        if(a > 21 && b > 21){
            return 0;
        }else if(a > 21){
            return b;
        }else if(b > 21){
            return a;
        }else{
            return Math.max(a, b);
        }
    }

    //blackjack(19, 21) → 21
    //blackjack(21, 19) → 21
    //blackjack(19, 22) → 19
    public static void main(String[]args){
        blackjack jack = new blackjack();
        System.out.println(jack.blackjack(19, 21));
        System.out.println(jack.blackjack(21, 19));
        System.out.println(jack.blackjack(19, 22));
    }

}
