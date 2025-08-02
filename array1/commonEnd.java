public class commonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        if(a[0] == b[0]){
            return true;
        }else if(a[a.length - 1] == b[b.length - 1]){
            return true;
        }else{
            return false;
        }
    }

    //commonEnd([1, 2, 3], [7, 3]) → true
    //commonEnd([1, 2, 3], [7, 3, 2]) → false
    //commonEnd([1, 2, 3], [1, 3]) → true
    public static void main(String[]args){
        commonEnd num = new commonEnd();
        System.out.println(num.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        System.out.println(num.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        System.out.println(num.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
    }
}
