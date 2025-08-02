public class makeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int maxUsed = Math.min(big,goal/5);
        int remaning = goal-maxUsed*5;
        return small >= remaning;
    }

    //makeBricks(3, 1, 8) → true
    //makeBricks(3, 1, 9) → false
    //makeBricks(3, 2, 10) → true
    public static void main(String[]args){
        makeBricks bricks = new makeBricks();
        System.out.println(bricks.makeBricks(3, 1, 8));
        System.out.println(bricks.makeBricks(3, 1, 9));
        System.out.println(bricks.makeBricks(3, 2, 10));
    }
}
