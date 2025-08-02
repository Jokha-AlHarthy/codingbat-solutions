public class countHi {
    public int countHi(String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i + 2).equals("hi")){
                count++;
            }
        }
        return count;
    }


    //countHi("abc hi ho") → 1
    //countHi("ABChi hi") → 2
    //countHi("hihi") → 2
    public static void main(String[]args){
        countHi hi = new countHi();
        System.out.println(hi.countHi("abc hi ho"));
        System.out.println(hi.countHi("ABChi hi"));
        System.out.println(hi.countHi("hihi"));
    }
}
