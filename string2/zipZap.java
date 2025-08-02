public class zipZap {
    public String zipZap(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < str.length()){
            if(i <= str.length() - 3 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p'){
                result.append("zp");
                i += 3;
            }else{
                result.append(str.charAt(i));
                i++;
            }
        }
        return result.toString();
    }

    //zipZap("zipXzap") → "zpXzp"
    //zipZap("zopzop") → "zpzp"
    //zipZap("zzzopzop") → "zzzpzp"
    public static void main(String[]args){
        zipZap zap = new zipZap();
        System.out.println(zap.zipZap("zipXzap"));
        System.out.println(zap.zipZap("zopzop"));
        System.out.println(zap.zipZap("zzzopzop"));
    }
}
