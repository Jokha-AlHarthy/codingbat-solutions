public class front11 {
    public int[] front11(int[] a, int[] b) {
        if(a.length > 0 && b.length > 0){
            return new int[]{a[0], b[0]};
        }else if(a.length > 0){
            return new int[]{a[0]};
        }else if(b.length > 0){
            return new int[]{b[0]};
        }else{
            return new int[]{};
        }

    }


    //front11([1, 2, 3], [7, 9, 8]) → [1, 7]
    //front11([1], [2]) → [1, 2]
    //front11([1, 7], []) → [1]
    public static void main(String[]args){
        front11 num = new front11();
        printArray(num.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}));
        printArray(num.front11(new int[]{1}, new int[]{2}));
        printArray(num.front11(new int[]{1, 7}, new int[]{}));
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
