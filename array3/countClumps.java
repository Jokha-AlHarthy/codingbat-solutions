public class countClumps {
    public int countClumps(int[] nums) {
        int count = 0;
        int i = 0;
        int n = nums.length;

        while(i < n){
            int value = nums[i];
            int length = 1;
            i++;
            while(i < n && nums[i] == value){
                length++;
                i++;
            }
            if(length > 1){
                count++;
            }
        }
        return count;
    }


    //countClumps([1, 2, 2, 3, 4, 4]) → 2
    //countClumps([1, 1, 2, 1, 1]) → 2
    //countClumps([1, 1, 1, 1, 1]) → 1
    public static void main(String[]args){
        countClumps clumps = new countClumps();
        System.out.println(clumps.countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println(clumps.countClumps(new int[]{1, 1, 2, 1, 1}));
        System.out.println(clumps.countClumps(new int[]{1, 1, 1, 1, 1}));
    }
}
