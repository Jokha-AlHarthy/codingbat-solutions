public class lucky13 {
    public boolean lucky13(int[] nums){
        for(int num : nums){
            if(num == 1 || num == 3){
                return false;
            }
        }
        return true;
    }

    //lucky13([0, 2, 4]) → true
    //lucky13([1, 2, 3]) → false
    //lucky13([1, 2, 4]) → false
    public static void main(String[]args){
        lucky13 num = new lucky13();
        System.out.println(num.lucky13(new int[]{0, 2, 4}));
        System.out.println(num.lucky13(new int[]{1, 2, 3}));
        System.out.println(num.lucky13(new int[]{1, 2, 4}));
    }
}
