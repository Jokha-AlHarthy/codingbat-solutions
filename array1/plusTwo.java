public class plusTwo {
    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    //plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    //plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    //plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
    public static void main(String[]args){
        plusTwo two = new plusTwo();
        printArray(two.plusTwo(new int[]{1, 2}, new int[]{3, 4}));
        printArray(two.plusTwo(new int[]{4, 4}, new int[]{2, 2}));
        printArray(two.plusTwo(new int[]{9, 2}, new int[]{3, 4}));
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
