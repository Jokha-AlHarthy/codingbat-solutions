public class middleWay {
    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1],b[1]};
    }

    //middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    //middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
    //middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
    public static void main(String[]args){
        middleWay middle = new middleWay();
        printArray(middle.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        printArray(middle.middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0}));
        printArray(middle.middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5}));
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
