public class arrayFront9 {
    public boolean arrayFront9(int[] nums) {
        int limit = Math.min(nums.length, 4);
        for(int i = 0; i < limit; i++){
            if(nums[i] == 9){
                return true;
            }
        }
        return false;
    }

    //arrayFront9([1, 2, 9, 3, 4]) → true
    //arrayFront9([1, 2, 3, 4, 9]) → false
    //arrayFront9([1, 2, 3, 4, 5]) → false
    public static void main(String[]args){
        arrayFront9 front9 = new arrayFront9();
        System.out.println(front9.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(front9.arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(front9.arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }
}
