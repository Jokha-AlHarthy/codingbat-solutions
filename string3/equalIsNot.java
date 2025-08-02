public class equalIsNot {
    public boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i + 2).equals("is")){
                isCount++;
            }
        }

        for(int i = 0; i < str.length() - 2; i++){
            if(str.substring(i, i + 3).equals("not")){
                notCount++;
            }
        }
        return isCount == notCount;
    }

    //equalIsNot("This is not") → false
    //equalIsNot("This is notnot") → true
    //equalIsNot("noisxxnotyynotxisi") → true
    public static void main(String[]args){
        equalIsNot equal = new equalIsNot();
        System.out.println(equal.equalIsNot("This is not"));
        System.out.println(equal.equalIsNot("This is notnot"));
        System.out.println(equal.equalIsNot("noisxxnotyynotxisi"));
    }
}
