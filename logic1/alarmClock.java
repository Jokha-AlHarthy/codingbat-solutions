public class alarmClock {
    public String alarmClock(int day, boolean vacation) {
        boolean weekend = (day == 0 || day == 6);
        if(vacation){
            if(weekend){
                return "off";
            }else{
                return "10:00";
            }
        }else{
            if(weekend){
                return "10:00";
            }else{
                return "7:00";
            }
        }
    }


    //alarmClock(1, false) → "7:00"
    //alarmClock(5, false) → "7:00"
    //alarmClock(0, false) → "10:00"
    public static void main(String[]args){
        alarmClock alarm = new alarmClock();
        System.out.println(alarm.alarmClock(1, false));
        System.out.println(alarm.alarmClock(5, false));
        System.out.println(alarm.alarmClock(0, false));
    }
}
