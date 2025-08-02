public class teenSum {
    public int teenSum(int a, int b) {
        if((a >= 13 && a<= 19) || (b>= 13 && b <= 19)){
            return 19;
        }else{
            return a + b;
        }
    }

    //teenSum(3, 4) → 7
    //teenSum(10, 13) → 19
    //teenSum(13, 2) → 19
    public static void main(String[]args){
        teenSum teen = new teenSum();
        System.out.println(teen.teenSum(3, 4));
        System.out.println(teen.teenSum(10, 13));
        System.out.println(teen.teenSum(13, 2));
    }
}
