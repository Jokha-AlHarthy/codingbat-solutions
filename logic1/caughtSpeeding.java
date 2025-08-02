public class caughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday){
            speed -= 5;
        }if(speed <= 60){
            return 0;
        }else if(speed <= 80){
            return 1;
        }else{
            return 2;
        }
    }

    //caughtSpeeding(60, false) → 0
    //caughtSpeeding(65, false) → 1
    //caughtSpeeding(65, true) → 0
    public static void main(String[]args){
        caughtSpeeding speed = new caughtSpeeding();
        System.out.println(speed.caughtSpeeding(60, false));
        System.out.println(speed.caughtSpeeding(65, false));
        System.out.println(speed.caughtSpeeding(65, true));
    }
}
