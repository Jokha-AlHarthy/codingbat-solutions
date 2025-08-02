public class frontTimes {
    public String frontTimes(String str, int n) {
        String front = str.length() < 3 ? str : str.substring(0, 3);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++){
            result.append(front);
        }
        return result.toString();
    }

    //frontTimes("Chocolate", 2) → "ChoCho"
    //frontTimes("Chocolate", 3) → "ChoChoCho"
    //frontTimes("Abc", 3) → "AbcAbcAbc"
    public static void main(String[]args){
        frontTimes front = new frontTimes();
        System.out.println(front.frontTimes("Chocolate", 2));
        System.out.println(front.frontTimes("Chocolate", 3));
        System.out.println(front.frontTimes("Abc", 3));
    }
}
