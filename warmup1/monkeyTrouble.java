public class monkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile){
            return true;
        }else if(!aSmile && !bSmile){
            return true;
        }else{
            return false;
        }
    }

    //monkeyTrouble(true, true) → true
    //monkeyTrouble(false, false) → true
    //monkeyTrouble(true, false) → false
    public static void main(String[]args){
        monkeyTrouble monkey = new monkeyTrouble();
        System.out.println(monkey.monkeyTrouble(true, true));
        System.out.println(monkey.monkeyTrouble(false, false));
        System.out.println(monkey.monkeyTrouble(true, false));
    }
}
