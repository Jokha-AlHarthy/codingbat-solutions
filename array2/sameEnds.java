public class sameEnds {
    public boolean sameEnds(int[] nums, int n){
        for(int i = 0; i < n; i++){
            if(nums[i] != nums[nums.length - n + i]){
                return false;
            }
        }
        return true;
    }

    //sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
    //sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
    //sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
    public static void main(String[]args){
        sameEnds ends = new sameEnds();
        System.out.println(ends.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1));
        System.out.println(ends.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));
        System.out.println(ends.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3));
    }
}
