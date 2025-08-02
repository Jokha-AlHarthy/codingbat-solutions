public class scoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        return largest(a) + largest(b);
    }

    public int largest(int[]nums){
        int max = 0;
        for (int num : nums){
            if(num % 10 == 0 && num > max){
                max = num;
            }
        }
        return max;
    }

    //scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
    //scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
    //scoresSpecial([12, 11, 4], [2, 20, 31]) → 20
    public static void main(String[]args){
        scoresSpecial score = new scoresSpecial();
        System.out.println(score.scoresSpecial(new int[]{12, 10, 4}, new int[]{2, 20, 30}));
        System.out.println(score.scoresSpecial(new int[]{20, 10, 4}, new int[]{2, 20, 10}));
        System.out.println(score.scoresSpecial(new int[]{12, 11, 4}, new int[]{2, 20, 31}));
    }
}
