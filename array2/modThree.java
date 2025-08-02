public class modThree {
    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            boolean allEven = nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0;
            boolean allOdd = nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0;
            if(allEven || allOdd){
                return true;
            }
        }
        return false;
    }

    //modThree([2, 1, 3, 5]) → true
    //modThree([2, 1, 2, 5]) → false
    //modThree([2, 4, 2, 5]) → true
    public static void main(String[]args){
        modThree three = new modThree();
        System.out.println(three.modThree(new int[]{2, 1, 3, 5}));
        System.out.println(three.modThree(new int[]{2, 1, 2, 5}));
        System.out.println(three.modThree(new int[]{2, 4, 2, 5}));
    }
}
