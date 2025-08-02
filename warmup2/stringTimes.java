public class stringTimes {
    public String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++){
            result.append(str);
        }
        return result.toString();
    }

    //stringTimes("Hi", 2) → "HiHi"
    //stringTimes("Hi", 3) → "HiHiHi"
    //stringTimes("Hi", 1) → "Hi"
    public static void main(String[]args){
        stringTimes times = new stringTimes();
        System.out.println(times.stringTimes("Hi", 2));
        System.out.println(times.stringTimes("Hi", 3));
        System.out.println(times.stringTimes("Hi", 1));
    }
}
