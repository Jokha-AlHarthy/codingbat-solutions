public class sumHeight {
    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for(int i = start; i < end; i++){
            sum += Math.abs(heights[i+1] - heights[i]);
        }
        return sum;
    }

    //sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
    //sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
    //sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
    public static void main(String[]args){
        sumHeight addition = new sumHeight();
        System.out.println(addition.sumHeights(new int[]{5, 3, 6, 7, 2}, 2, 4));
        System.out.println(addition.sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 1));
        System.out.println(addition.sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));

    }
}
