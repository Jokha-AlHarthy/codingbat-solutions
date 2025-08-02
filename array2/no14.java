public class no14 {
    public boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;
        for(int num : nums){
            if(num == 1){
                has1 = true;
            }else if (num == 4){
                has4 = true;
            }
        }
        return !has1 || !has4;
    }

    //no14([1, 2, 3]) → true
    //no14([1, 2, 3, 4]) → false
    //no14([2, 3, 4]) → true
    public static void main(String[]args){
        no14 num = new no14();
        System.out.println(num.no14(new int[]{1, 2, 3}));
        System.out.println(num.no14(new int[]{1, 2, 3, 4}));
        System.out.println(num.no14(new int[]{2, 3, 4}));
    }
}
