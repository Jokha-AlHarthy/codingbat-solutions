public class extraFront {
    public String extraFront(String str) {
        String front;
        if(str.length() >= 2){
            front = str.substring(0,2);
        }else if(str.length() == 1){
            front = str;
        }else{
            front = "";
        }
        return front + front+front;
    }

    //extraFront("Hello") → "HeHeHe"
    //extraFront("ab") → "ababab"
    //extraFront("H") → "HHH"
    public static void main(String[]args){
        extraFront f = new extraFront();
        System.out.println(f.extraFront("Hello"));
        System.out.println(f.extraFront("ab"));
        System.out.println(f.extraFront("H"));
    }
}
