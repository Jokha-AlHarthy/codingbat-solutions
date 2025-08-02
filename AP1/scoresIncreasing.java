public class scoresIncreasing {
    public boolean scoresIncreasing(int[] scores) {
        for(int i = 1; i < scores.length; i++){
            if(scores[i] < scores[i-1]){
                return false;
            }
        }
        return true;
    }

    //scoresIncreasing([1, 3, 4]) → true
    //scoresIncreasing([1, 3, 2]) → false
    //scoresIncreasing([1, 1, 4]) → true
    public static void main(String[]args){
        scoresIncreasing score = new scoresIncreasing();
        System.out.println(score.scoresIncreasing(new int[]{1, 3, 4}));
        System.out.println(score.scoresIncreasing(new int[]{1, 3, 2}));
        System.out.println(score.scoresIncreasing(new int[]{1, 1, 4}));
    }
}
