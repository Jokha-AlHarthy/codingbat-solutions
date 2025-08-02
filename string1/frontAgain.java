public class frontAgain {
    public boolean frontAgain(String str) {
        if(str.length() < 2){
            return false;
        }else if(str.substring(0, 2).equals(str.substring(str.length() - 2))){
            return true;
        }else{
            return false;
        }
    }

    //frontAgain("edited") → true
    //frontAgain("edit") → false
    //frontAgain("ed") → true
    public static void main(String[]args){
        frontAgain front = new frontAgain();
        System.out.println(front.frontAgain("edited"));
        System.out.println(front.frontAgain("edit"));
        System.out.println(front.frontAgain("ed"));
    }

}
