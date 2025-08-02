public class makeEnds {
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0],nums[nums.length - 1]};
    }

    //makeEnds([1, 2, 3]) → [1, 3]
    //makeEnds([1, 2, 3, 4]) → [1, 4]
    //makeEnds([7, 4, 6, 2]) → [7, 2]
    public static void main(String[]args){
        makeEnds end = new makeEnds();
        printArray(end.makeEnds(new int[]{1, 2, 3}));
        printArray(end.makeEnds(new int[]{1, 2, 3, 4}));
        printArray(end.makeEnds(new int[]{7, 4, 6, 2}));
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
