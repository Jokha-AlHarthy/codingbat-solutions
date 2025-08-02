public class sleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        return false;
    }

    //sleepIn(false, false) → true
    //sleepIn(true, false) → false
    //sleepIn(false, true) → true
    public static void main(String [] args){
        sleepIn sleep = new sleepIn();
        System.out.println(sleep.sleepIn(false,false));
        System.out.println(sleep.sleepIn(true,false));
        System.out.println(sleep.sleepIn(false,true));
    }
}



