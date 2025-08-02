public class userCompare {
    public int userCompare(String aName, int aId, String bName, int bId) {
        int nameCompare = aName.compareTo(bName);
        if(nameCompare < 0){
            return -1;
        }else if(nameCompare > 0){
            return 1;
        }else{
            if(aId < bId){
                return -1;
            }else if(aId > bId){
                return 1;
            }else{
                return 0;
            }
        }
    }

    //userCompare("bb", 1, "zz", 2) → -1
    //userCompare("bb", 1, "aa", 2) → 1
    //userCompare("bb", 1, "bb", 1) → 0
    public static void main(String[]args){
        userCompare user = new userCompare();
        System.out.println(user.userCompare("bb", 1, "zz", 2));
        System.out.println(user.userCompare("bb", 1, "aa", 2));
        System.out.println(user.userCompare("bb", 1, "bb", 1));
    }
}
