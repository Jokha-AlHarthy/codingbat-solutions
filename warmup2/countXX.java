public class countXX {
    int countXX(String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i + 2).equals("xx")){
                count++;
            }
        }
        return count;
    }

    //countXX("abcxx") → 1
    //countXX("xxx") → 2
    //countXX("xxxx") → 3
    public static void main(String[]args){
        countXX count = new countXX();
        System.out.println(count.countXX("abcxx"));
        System.out.println(count.countXX("xxx"));
        System.out.println(count.countXX("xxxx"));
    }
}
