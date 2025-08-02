public class xyzThere {
    public boolean xyzThere(String str) {
        for(int i = 0; i < str.length() - 2; i++){
            if(str.substring(i, i + 3).equals("xyz")){
                if(i == 0 || str.charAt(i - 1) != '.'){
                    return true;
                }
            }
        }
        return false;
    }

    //xyzThere("abcxyz") → true
    //xyzThere("abc.xyz") → false
    //xyzThere("xyz.abc") → true
    public static void main(String[]args){
        xyzThere xyz = new xyzThere();
        System.out.println(xyz.xyzThere("abcxyz"));
        System.out.println(xyz.xyzThere("abc.xyz"));
        System.out.println(xyz.xyzThere("xyz.abc"));
    }
}
