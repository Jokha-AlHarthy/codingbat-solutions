public class more14 {
    public boolean more14(int[] nums){
        int count1 = 0;
        int count4 = 0;
        for(int num : nums){
            if (num == 1){
                count1++;
            }else if(num == 4){
                count4++;
            }
        }
        return count1 > count4;
    }


    //more14([1, 4, 1]) → true
    //more14([1, 4, 1, 4]) → false
    //more14([1, 1]) → true
    public static void main(String[]args){
        more14 num = new more14();
        System.out.println(num.more14(new int[]{1, 4, 1}));
        System.out.println(num.more14(new int[]{1, 4, 1, 4}));
        System.out.println(num.more14(new int[]{1, 1}));
    }
}
