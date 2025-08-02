public class countYZ {
    public int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if((ch == 'y' || ch == 'z')){
                if(i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))){
                    count++;
                }
            }
        }
        return count;
    }

    //countYZ("fez day") → 2
    //countYZ("day fez") → 2
    //countYZ("day fyyyz") → 2
    public static void main(String[]args){
        countYZ YZ = new countYZ();
        System.out.println(YZ.countYZ("fez day"));
        System.out.println(YZ.countYZ("day fez"));
        System.out.println(YZ.countYZ("day fyyyz"));
    }
}
