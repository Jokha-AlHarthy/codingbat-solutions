public class matchUp {
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if(diff <= 2 && nums1[i] != nums2[i]){
                count++;
            }
        }
        return count;
    }

    //matchUp([1, 2, 3], [2, 3, 10]) → 2
    //matchUp([1, 2, 3], [2, 3, 5]) → 3
    //matchUp([1, 2, 3], [2, 3, 3]) → 2
    public static void main(String[]args){
        matchUp up = new matchUp();
        System.out.println(up.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        System.out.println(up.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        System.out.println(up.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
    }
}
