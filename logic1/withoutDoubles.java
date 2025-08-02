public class withoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles && die1 == die2){
            if(die1 == 6){
                die1 = 1;
            }else{
                die1++;
            }
        }
        return die1 + die2;
    }

    //withoutDoubles(2, 3, true) → 5
    //withoutDoubles(3, 3, true) → 7
    //withoutDoubles(3, 3, false) → 6
    public static void main(String[]args){
        withoutDoubles doubles = new withoutDoubles();
        System.out.println(doubles.withoutDoubles(2, 3, true));
        System.out.println(doubles.withoutDoubles(3, 3, true));
        System.out.println(doubles.withoutDoubles(3, 3, false));
    }
}
