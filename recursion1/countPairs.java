public class countPairs {
    public int countPairs(String str) {
        if(str.length() < 3) {
            return 0;
        }else if(str.charAt(0) == str.charAt(2)){
            return 1 + countPairs(str.substring(1));
        }else{
            return countPairs(str.substring(1));
        }
    }

    //countPairs("axa") → 1
    //countPairs("axax") → 2
    //countPairs("axbx") → 1
    public static void main(String[]args){
        countPairs pair = new countPairs();
        System.out.println(pair.countPairs("axa"));
        System.out.println(pair.countPairs("axax"));
        System.out.println(pair.countPairs("axbx"));
    }
}
