public class only14 {
    public boolean only14(int[] nums){
        for(int num : nums){
            if(num != 1 && num != 4){
                return false;
            }
        }
        return true;
    }

    //only14([1, 4, 1, 4]) → true
    //only14([1, 4, 2, 4]) → false
    //only14([1, 1]) → true
    public static void main(String[]args){
        only14 only = new only14();
        System.out.println(only.only14(new int[]{1, 4, 1, 4}));
        System.out.println(only.only14(new int[]{1, 4, 2, 4}));
        System.out.println(only.only14(new int[]{1, 1}));
    }
}
