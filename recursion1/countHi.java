public class countHi {
    public int countHi(String str) {
        if(str.length() < 2){
            return 0;
        }else if(str.substring(0,2).equals("hi")){
            return 1 + countHi(str.substring(1));
        }else{
            return countHi(str.substring(1));
        }
    }

    //countHi("xxhixx") → 1
    //countHi("xhixhix") → 2
    //countHi("hi") → 1
    public static void main(String[]args){
        countHi count = new countHi();
        System.out.println(count.countHi("xxhixx"));
        System.out.println(count.countHi("xhixhix"));
        System.out.println(count.countHi("hi"));
    }
}
