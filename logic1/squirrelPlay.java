public class squirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        int upperLimit = isSummer ? 100 : 90;
        return temp >= 60 && temp <= upperLimit;
    }

    //squirrelPlay(70, false) → true
    //squirrelPlay(95, false) → false
    //squirrelPlay(95, true) → true
    public static void main(String[]args){
        squirrelPlay play = new squirrelPlay();
        System.out.println(play.squirrelPlay(70, false));
        System.out.println(play.squirrelPlay(95, false));
        System.out.println(play.squirrelPlay(95, true));
    }
}
