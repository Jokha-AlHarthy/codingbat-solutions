public class frontPiece {
    public int[] frontPiece(int[] nums) {
        if(nums.length <= 2){
            return nums;
        }else{
            return new int[]{nums[0], nums[1]};
        }
    }

    //frontPiece([1, 2, 3]) → [1, 2]
    //frontPiece([1, 2]) → [1, 2]
    //frontPiece([1]) → [1]
    public static void main(String[]args){
        frontPiece front = new frontPiece();
        printArray(front.frontPiece(new int[]{1, 2, 3}));
        printArray(front.frontPiece(new int[]{1, 2}));
        printArray(front.frontPiece(new int[]{1}));
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
