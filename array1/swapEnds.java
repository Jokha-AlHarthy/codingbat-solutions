public class swapEnds {
    public int[] swapEnds(int[] nums) {
        int modified = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = modified;
        return nums;
    }

    //swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
    //swapEnds([1, 2, 3]) → [3, 2, 1]
    //swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
    public static void main(String[]args){
        swapEnds swap = new swapEnds();
        printArray(swap.swapEnds(new int[]{1, 2, 3, 4}));
        printArray(swap.swapEnds(new int[]{1, 2, 3}));
        printArray(swap.swapEnds(new int[]{8, 6, 7, 9, 5}));
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
