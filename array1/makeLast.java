public class makeLast {
    public int[] makeLast(int[] nums) {
        int[]result = new int[nums.length * 2];
        result[result.length - 1 ] = nums[nums.length - 1 ];
        return result;
    }

    //makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    //makeLast([1, 2]) → [0, 0, 0, 2]
    //makeLast([3]) → [0, 3]
    public static void main(String[]args){
        makeLast num = new makeLast();
        printArray(num.makeLast(new int[]{4, 5, 6}));
        printArray(num.makeLast(new int[]{1,2}));
        printArray(num.makeLast(new int[]{3}));
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
