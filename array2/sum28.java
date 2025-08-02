public class sum28 {
    public boolean sum28(int[] nums){
        int sum = 0;
        for(int num : nums){
            if(num == 2){
                sum += 2;
            }
        }
        return sum == 8;
    }

    //sum28([2, 3, 2, 2, 4, 2]) → true
    //sum28([2, 3, 2, 2, 4, 2, 2]) → false
    //sum28([1, 2, 3, 4]) → false
    public static void main(String[]args){
        sum28 num = new sum28();
        System.out.println(num.sum28(new int[]{2, 3, 2, 2, 4, 2}));
        System.out.println(num.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        System.out.println(num.sum28(new int[]{1, 2, 3, 4}));
    }
}
