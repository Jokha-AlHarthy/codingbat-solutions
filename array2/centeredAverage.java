public class centeredAverage {
    public int centeredAverage(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int max = nums[0];
        for(int num : nums){
            sum += num;
            if(num < min){
                min = num;
            }else if(num >  max){
                max = num;
            }
        }
        return (sum - min - max) / (nums.length - 2);
    }

    //centeredAverage([1, 2, 3, 4, 100]) → 3
    //centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
    //centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
    public static void main(String[]args){
        centeredAverage average = new centeredAverage();
        System.out.println(average.centeredAverage(new int[]{1, 2, 3, 4, 100}));
        System.out.println(average.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        System.out.println(average.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }
}
