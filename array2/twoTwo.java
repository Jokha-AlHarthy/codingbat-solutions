public class twoTwo {
    public boolean twoTwo(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2){
                boolean hasNeighbor = (i > 0 && nums[i - 1] == 2) || (i < nums.length - 1 && nums[i + 1] == 2);
                if(!hasNeighbor){
                    return false;
                }
            }
        }
        return true;
    }

    //twoTwo([4, 2, 2, 3]) → true
    //twoTwo([2, 2, 4]) → true
    //twoTwo([2, 2, 4, 2]) → false
    public static void main(String[]args){
        twoTwo two = new twoTwo();
        System.out.println(two.twoTwo(new int[]{4, 2, 2, 3}));
        System.out.println(two.twoTwo(new int[]{2, 2, 4}));
        System.out.println(two.twoTwo(new int[]{2, 2, 4, 2}));
    }
}
