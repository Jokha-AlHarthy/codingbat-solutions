public class makeMiddle {
    public int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid]};
    }

    //makeMiddle([1, 2, 3, 4]) → [2, 3]
    //makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    //makeMiddle([1, 2]) → [1, 2]
    public static void main(String[]args){
        makeMiddle middle = new makeMiddle();
        printArray(middle.makeMiddle(new int[]{1, 2, 3, 4}));
        printArray(middle.makeMiddle(new int[]{7, 1, 2, 3, 4, 9}));
        printArray(middle.makeMiddle(new int[]{1, 2}));
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
