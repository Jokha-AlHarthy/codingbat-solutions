public class hasBad {
    public boolean hasBad(String str) {
        if(str.length()>=3 && str.substring(0,3).equals("bad")){
            return true;
        }else if(str.length()>=4 && str.substring(1,4).equals("bad")){
            return true;
        }else{
            return false;
        }
    }

    //hasBad("badxx") → true
    //hasBad("xbadxx") → true
    //hasBad("xxbadxx") → false
    public static void main(String[]args){
        hasBad bad = new hasBad();
        System.out.println(bad.hasBad("badxx"));
        System.out.println(bad.hasBad("xbadxx"));
        System.out.println(bad.hasBad("xxbadxx"));
    }
}
