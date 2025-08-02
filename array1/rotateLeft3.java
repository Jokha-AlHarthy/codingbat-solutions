public class rotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public static void main(String[] args) {
        rotateLeft3 rotate = new rotateLeft3();
        printArray(rotate.rotateLeft3(new int[]{1, 2, 3}));
        printArray(rotate.rotateLeft3(new int[]{5, 11, 9}));
        printArray(rotate.rotateLeft3(new int[]{7, 0, 0}));
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
