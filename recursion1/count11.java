public class count11 {
    public int count11(String str) {
        if(str.length() < 2) {
            return 0;
        }else if(str.startsWith("11")){
            return 1 + count11(str.substring(2));
        }else{
            return count11(str.substring(1));
        }
    }


    //count11("11abc11") → 2
    //count11("abc11x11x11") → 3
    //count11("111") → 1
    public static void main(String[]args){
        count11 count = new count11();
        System.out.println(count.count11("11abc11"));
        System.out.println(count.count11("abc11x11x11"));
        System.out.println(count.count11("111"));
    }
}
