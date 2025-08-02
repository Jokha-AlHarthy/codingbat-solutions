public class notReplace {
    public String notReplace(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < str.length()){
            if(i + 1 < str.length() && str.substring(i, i + 2).equals("is")){
                boolean beforeIsLetter = (i > 0 && Character.isLetter(str.charAt(i - 1)));
                boolean afterIsLetter = (i + 2 < str.length() && Character.isLetter(str.charAt(i + 2)));
                if(!beforeIsLetter && !afterIsLetter){
                    result.append("is not");
                    i += 2;
                    continue;
                }else{
                    result.append(str.charAt(i));
                    i++;
                }
            }else{
                result.append(str.charAt(i));
                i++;
            }
        }
        return result.toString();
    }

    //notReplace("is test") → "is not test"
    //notReplace("is-is") → "is not-is not"
    //notReplace("This is right") → "This is not right"
    public static void main(String[]args){
        notReplace replace = new notReplace();
        System.out.println(replace.notReplace("is test"));
        System.out.println(replace.notReplace("is-is"));
        System.out.println(replace.notReplace("This is right"));
    }
}
