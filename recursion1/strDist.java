public class strDist {
    public int strDist(String str, String sub) {
        int strLen = str.length();
        int subLen = sub.length();
        if(strLen < subLen){
            return 0;
        }else if(str.startsWith(sub) && str.endsWith(sub)){
            return strLen;
        }else if(!str.startsWith(sub)){
            return strDist(str.substring(1), sub);
        }else{
            return strDist(str.substring(0, strLen - 1), sub);
        }
    }

    //strDist("catcowcat", "cat") → 9
    //strDist("catcowcat", "cow") → 3
    //strDist("cccatcowcatxx", "cat") → 9
    public static void main(String[]args){
        strDist dist = new strDist();
        System.out.println(dist.strDist("catcowcat", "cat"));
        System.out.println(dist.strDist("catcowcat", "cow"));
        System.out.println(dist.strDist("cccatcowcatxx", "cat"));
    }
}
