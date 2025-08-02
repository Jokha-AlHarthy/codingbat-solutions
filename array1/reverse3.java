public class reverse3 {
    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    //reverse3([1, 2, 3]) → [3, 2, 1]
    //reverse3([5, 11, 9]) → [9, 11, 5]
    //reverse3([7, 0, 0]) → [0, 0, 7]
    public static void main(String[]args){
        reverse3 reverse = new reverse3();
        printArray(reverse.reverse3(new int[]{1, 2, 3}));
        printArray(reverse.reverse3(new int[]{5, 11, 9}));
        printArray(reverse.reverse3(new int[]{7, 0, 0}));
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
