public class last2 {
    public int last2(String str) {
        if(str.length() < 2){
            return 0;
        }
        String last2 = str.substring(str.length() - 2);
        int count = 0;
        for(int i = 0; i < str.length() - 2; i++){
            String sub = str.substring(i, i + 2);
            if(sub.equals(last2)){
                count++;
            }
        }
        return count;
    }

    //last2("hixxhi") → 1
    //last2("xaxxaxaxx") → 1
    //last2("axxxaaxx") → 2
    public static void main(String[]args){
        last2 last = new last2();
        System.out.println(last.last2("hixxhi"));
        System.out.println(last.last2("xaxxaxaxx"));
        System.out.println(last.last2("axxxaaxx"));
    }
}
