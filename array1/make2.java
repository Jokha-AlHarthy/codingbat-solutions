public class make2 {
    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int count = 0;

        for(int i = 0; i < a.length && count < 2; i++){
            result[count++] = a[i];
        }

        for(int i = 0; i < b.length && count < 2; i++){
            result[count++] = b[i];
        }

        return result;
    }

    //make2([4, 5], [1, 2, 3]) → [4, 5]
    //make2([4], [1, 2, 3]) → [4, 1]
    //make2([], [1, 2]) → [1, 2]
    public static void main(String[]args){
        make2 num = new make2();
        printArray(num.make2(new int[]{4, 5}, new int[]{1, 2, 3}));
        printArray(num.make2(new int[]{4}, new int[]{1, 2, 3}));
        printArray(num.make2(new int[]{}, new int[]{1, 2}));
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
