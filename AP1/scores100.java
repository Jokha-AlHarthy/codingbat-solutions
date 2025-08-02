public class scores100 {
    public boolean scores100(int[] scores) {
        for(int i=0; i < scores.length - 1; i++){
            if(scores[i]==100 && scores[i+1]==100){
                return true;
            }
        }
        return false;
    }

    //scores100([1, 100, 100]) → true
    //scores100([1, 100, 99, 100]) → false
    //scores100([100, 1, 100, 100]) → true
    public static void main(String[]args){
        scores100 score = new scores100();
        System.out.println(score.scores100(new int[]{1, 100, 100}));
        System.out.println(score.scores100(new int[]{1, 100, 99, 100}));
        System.out.println(score.scores100(new int[]{100, 1, 100, 100}));
    }
}
