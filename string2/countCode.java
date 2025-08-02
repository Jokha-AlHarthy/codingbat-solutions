public class countCode {
    public int countCode(String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 3; i++){
            if(str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e'){
                count++;
            }
        }
        return count;
    }


    //countCode("aaacodebbb") → 1
    //countCode("codexxcode") → 2
    //countCode("cozexxcope") → 2
    public static void main(String[]args){
        countCode code = new countCode();
        System.out.println(code.countCode("aaacodebbb"));
        System.out.println(code.countCode("codexxcode"));
        System.out.println(code.countCode("cozexxcope"));
    }
}
