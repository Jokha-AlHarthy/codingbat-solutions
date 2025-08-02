public class haveThree {
    public boolean haveThree(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 3){
                if(i < nums.length - 1 && nums[i + 1] == 3){
                    return false;
                }
                count++;
            }
        }
        return count == 3;
    }


    //haveThree([3, 1, 3, 1, 3]) → true
    //haveThree([3, 1, 3, 3]) → false
    //haveThree([3, 4, 3, 3, 4]) → false
    public static void main(String[]args){
        haveThree three = new haveThree();
        System.out.println(three.haveThree(new int[]{3, 1, 3, 1, 3}));
        System.out.println(three.haveThree(new int[]{3, 1, 3, 3}));
        System.out.println(three.haveThree(new int[]{3, 4, 3, 3, 4}));
    }
}
