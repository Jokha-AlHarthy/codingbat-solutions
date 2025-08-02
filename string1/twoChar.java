public class twoChar {
    public String twoChar(String str, int index) {
        if(index < 0 || index + 2 > str.length()){
            return str.substring(0,2);
        }else{
            return str.substring(index, index + 2);
        }
    }

    //twoChar("java", 0) → "ja"
    //twoChar("java", 2) → "va"
    //twoChar("java", 3) → "ja"
    public static void main(String[]args){
        twoChar two = new twoChar();
        System.out.println(two.twoChar("java", 0));
        System.out.println(two.twoChar("java", 2));
        System.out.println(two.twoChar("java", 3));
    }

}
