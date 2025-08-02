public class sumHeight2 {
    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for(int i = start; i < end; i++){
            int diff = heights[i+1] - heights[i];
            if(diff > 0){
                sum+=2 * diff;
            }
            else{
                sum+= Math.abs(diff);
            }
        }
        return sum;
    }

    //sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
    //sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
    //sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15
    public static void main(String[]args){
        sumHeight2 addition = new sumHeight2();
        System.out.println(addition.sumHeights2(new int[]{5, 3, 6, 7, 2}, 2, 4));
        System.out.println(addition.sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 1));
        System.out.println(addition.sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 4));

    }
}
