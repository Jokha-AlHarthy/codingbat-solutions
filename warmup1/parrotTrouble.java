public class parrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if(talking && (hour < 7 || hour > 20)){
            return true;
        }else{
            return false;
        }
    }

    //parrotTrouble(true, 6) → true
    //parrotTrouble(true, 7) → false
    //parrotTrouble(false, 6) → false
    public static void main(String[]args){
        parrotTrouble parrot = new parrotTrouble();
        System.out.println(parrot.parrotTrouble(true, 6));
        System.out.println(parrot.parrotTrouble(true, 7));
        System.out.println(parrot.parrotTrouble(false, 6));

    }
}
