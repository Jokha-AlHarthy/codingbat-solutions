public class maxTriple {
    public int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        return Math.max(first,Math.max(middle, last));
    }

    //maxTriple([1, 2, 3]) → 3
    //maxTriple([1, 5, 3]) → 5
    //maxTriple([5, 2, 3]) → 5
    public static void main(String[]args){
        maxTriple max = new maxTriple();
        System.out.println(max.maxTriple(new int[]{1, 2, 3}));
        System.out.println(max.maxTriple(new int[]{1, 5, 3}));
        System.out.println(max.maxTriple(new int[]{5, 2, 3}));
    }


}
