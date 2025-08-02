public class countEvens {
    public int countEvens(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(num % 2 == 0){
                count++;
            }
        }
        return count;
    }

    //countEvens([2, 1, 2, 3, 4]) → 3
    //countEvens([2, 2, 0]) → 3
    //countEvens([1, 3, 5]) → 0
    public static void main(String[]args){
        countEvens evens = new countEvens();
        System.out.println(evens.countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(evens.countEvens(new int[]{2, 2, 0}));
        System.out.println(evens.countEvens(new int[]{1, 3, 5}));
    }
}
