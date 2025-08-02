public class maxBlock {
    public int maxBlock(String str) {
        if(str.length() == 0){
            return 0;
        }
        int max = 1;
        int current = 1;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i - 1)){
                current++;
                if(current > max){
                    max = current;
                }
            }else{
                current = 1;
            }
        }
        return max;
    }

    //maxBlock("hoopla") → 2
    //maxBlock("abbCCCddBBBxx") → 3
    //maxBlock("") → 0
    public static void main(String[]args){
        maxBlock max = new maxBlock();
        System.out.println(max.maxBlock("hoopla"));
        System.out.println(max.maxBlock("abbCCCddBBBxx"));
        System.out.println(max.maxBlock(""));
    }
}
