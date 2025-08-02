public class start1 {
    public int start1(int[] a, int[] b) {
        int count = 0;
        if(a.length > 0 && a[0] == 1){
            count++;
        }if(b.length > 0 && b[0] == 1){
            count++;
        }
        return count;
    }

    //start1([1, 2, 3], [1, 3]) → 2
    //start1([7, 2, 3], [1]) → 1
    //start1([1, 2], []) → 1
    public static void main(String[]args){
        start1 start = new start1();
        System.out.println(start.start1(new int[]{1, 2, 3}, new int[]{1, 3}));
        System.out.println(start.start1(new int[]{7, 2, 3}, new int[]{1}));
        System.out.println(start.start1(new int[]{1, 2}, new int[]{}));

    }
}
