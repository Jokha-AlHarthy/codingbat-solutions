public class endOther {
    public boolean endOther(String a, String b) {
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();
        if(lowerA.endsWith(lowerB) || lowerB.endsWith(lowerA)){
            return true;
        }else{
            return false;
        }
    }

    //endOther("Hiabc", "abc") → true
    //endOther("AbC", "HiaBc") → true
    //endOther("abc", "abXabc") → true
    public static void main(String[]args){
        endOther end = new endOther();
        System.out.println(end.endOther("Hiabc","abc"));
        System.out.println(end.endOther("abc","Hiabc"));
        System.out.println(end.endOther("abc","abXabc"));
    }
}
