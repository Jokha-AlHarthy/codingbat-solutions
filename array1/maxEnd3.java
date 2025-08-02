public class maxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        return new int[]{max, max, max};
    }

    //maxEnd3([1, 2, 3]) → [3, 3, 3]
    //maxEnd3([11, 5, 9]) → [11, 11, 11]
    //maxEnd3([2, 11, 3]) → [3, 3, 3]
    public static void main(String[]args){
        maxEnd3 max = new maxEnd3();
        printArray(max.maxEnd3(new int[]{1, 2, 3}));
        printArray(max.maxEnd3(new int[]{11, 5, 9}));
        printArray(max.maxEnd3(new int[]{2, 11, 3}));
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
