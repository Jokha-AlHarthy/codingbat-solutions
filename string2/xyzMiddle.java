public class xyzMiddle {
    public boolean xyzMiddle(String str) {
        int len = str.length();
        for(int i = 0; i <= len - 3; i++){
            if(str.substring(i, i + 3).equals("xyz")){
                int left = i;
                int right = len - (i + 3);
                if(Math.abs(left - right) <= 1){
                    return true;
                }
            }
        }
        return false;
    }

    //xyzMiddle("AAxyzBB") → true
    //xyzMiddle("AxyzBB") → true
    //xyzMiddle("AxyzBBB") → false
    public static void main(String[]args){
        xyzMiddle middle = new xyzMiddle();
        System.out.println(middle.xyzMiddle("AAxyzBB"));
        System.out.println(middle.xyzMiddle("AxyzBB"));
        System.out.println(middle.xyzMiddle("AxyzBBB"));
    }
}
