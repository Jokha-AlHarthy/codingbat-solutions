public class repeatFront {
    public String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();
        for(int i = n; i > 0; i--){
            result.append(str.substring(0, i));
        }
        return result.toString();
    }

    //repeatFront("Chocolate", 4) → "ChocChoChC"
    //repeatFront("Chocolate", 3) → "ChoChC"
    //repeatFront("Ice Cream", 2) → "IcI"
    public static void main(String[]args){
        repeatFront front = new repeatFront();
        System.out.println(front.repeatFront("Chocolate", 4));
        System.out.println(front.repeatFront("Chocolate", 3));
        System.out.println(front.repeatFront("Ice Cream", 2));
    }
}
