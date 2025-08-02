public class scoresAverage {
    public int scoresAverage(int[] scores) {
        int firstHalf = average(scores, 0, scores.length / 2);
        int secondHalf = average(scores, scores.length / 2, scores.length);
        return Math.max(firstHalf,secondHalf);
    }

    int average(int[]scores, int start, int end){
        int sum = 0;
        for (int i = start; i<end; i++){
            sum+=scores[i];
        }
        return sum / (end - start);
    }

    //scoresAverage([2, 2, 4, 4]) → 4
    //scoresAverage([4, 4, 4, 2, 2, 2]) → 4
    //scoresAverage([3, 4, 5, 1, 2, 3]) → 4
    public static void main(String[]args){
        scoresAverage score = new scoresAverage();
        System.out.println(score.scoresAverage(new int[]{2, 2, 4, 4}));
        System.out.println(score.scoresAverage(new int[]{4, 4, 4, 2, 2, 2}));
        System.out.println(score.scoresAverage(new int[]{3, 4, 5, 1, 2, 3}));
    }
}
