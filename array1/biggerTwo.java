public class biggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if(sumB > sumA){
            return b;
        }else{
            return a;
        }
    }

    //biggerTwo([1, 2], [3, 4]) → [3, 4]
    //biggerTwo([3, 4], [1, 2]) → [3, 4]
    //biggerTwo([1, 1], [1, 2]) → [1, 2]
    public static void main(String[]args){
        biggerTwo bigger = new biggerTwo();
        printArray(bigger.biggerTwo(new int[]{1, 2}, new int[]{3, 4}));
        printArray(bigger.biggerTwo(new int[]{3, 4}, new int[]{1, 2}));
        printArray(bigger.biggerTwo(new int[]{1, 1}, new int[]{1, 2}));

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
