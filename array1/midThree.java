public class midThree {
    public int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
    }

    //midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    //midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    //midThree([1, 2, 3]) → [1, 2, 3]
    public static void main(String[]args){
        midThree middle = new midThree();
        printArray(middle.midThree(new int[]{1, 2, 3, 4, 5}));
        printArray(middle.midThree(new int[]{8, 6, 7, 5, 3, 0, 9}));
        printArray(middle.midThree(new int[]{1, 2, 3}));
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
