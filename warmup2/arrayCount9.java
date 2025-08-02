public class arrayCount9 {
    public int arrayCount9(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(num == 9){
                count++;
            }
        }
        return count;
    }

    //arrayCount9([1, 2, 9]) → 1
    //arrayCount9([1, 9, 9]) → 2
    //arrayCount9([1, 9, 9, 3, 9]) → 3
    public static void main(String[]args){
        arrayCount9 count9 = new arrayCount9();
        System.out.println(count9.arrayCount9(new int[]{1, 2, 9}));
        System.out.println(count9.arrayCount9(new int[]{1, 9, 9}));
        System.out.println(count9.arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }
}
