public class loneTeen {
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        if(aTeen && !bTeen){
            return true;
        }else if(!aTeen && bTeen){
            return true;
        }else{
            return false;
        }
    }

    //loneTeen(13, 99) → true
    //loneTeen(21, 19) → true
    //loneTeen(13, 13) → false
    public static void main(String[]args){
        loneTeen teen = new loneTeen();
        System.out.println(teen.loneTeen(13, 99));
        System.out.println(teen.loneTeen(21, 19));
        System.out.println(teen.loneTeen(13, 13));
    }

}
