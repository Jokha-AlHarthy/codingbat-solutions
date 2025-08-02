public class linearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        int i = 0;
        int j = 0;
        while (i < outer.length && j < inner.length) {
            if(outer[i] < inner[j]){
                i++;
            }else if(outer[i] == inner[j]){
                i++;
                j++;
            }else{
                return false;
            }
        }
        return j == inner.length;
    }

    //linearIn([1, 2, 4, 6], [2, 4]) → true
    //linearIn([1, 2, 4, 6], [2, 3, 4]) → false
    //linearIn([1, 2, 4, 4, 6], [2, 4]) → true
    public static void main(String[]args){
        linearIn linear = new linearIn();
        System.out.println(linear.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        System.out.println(linear.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        System.out.println(linear.linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
    }
}
