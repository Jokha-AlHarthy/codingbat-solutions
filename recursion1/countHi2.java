public class countHi2 {
    public int countHi2(String str) {
        if(str.length() < 2){
            return 0;
        }else if(str.length() >= 3 && str.substring(0, 3).equals("xhi")){
            return countHi2(str.substring(3));
        }else if(str.substring(0, 2).equals("hi")){
            return 1 + countHi2(str.substring(2));
        }else{
            return countHi2(str.substring(1));
        }
    }

    //countHi2("ahixhi") → 1
    //countHi2("ahibhi") → 2
    //countHi2("xhixhi") → 0
    public static void main(String[]args){
        countHi2 hi = new countHi2();
        System.out.println(hi.countHi2("hixhi"));
        System.out.println(hi.countHi2("ahibhi"));
        System.out.println(hi.countHi2("xhibit"));
    }
}
