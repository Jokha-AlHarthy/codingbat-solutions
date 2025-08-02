public class xyBalance {
    public boolean xyBalance(String str) {
        int lastX = -1;
        int lastY = -1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'x'){
                lastX = i;
            }else if(str.charAt(i) == 'y'){
                lastY = i;
            }
        }
        return lastX <= lastY;
    }

    //xyBalance("aaxbby") → true
    //xyBalance("aaxbb") → false
    //xyBalance("yaaxbb") → false
    public static void main(String[]args){
        xyBalance balance = new xyBalance();
        System.out.println(balance.xyBalance("aaxbby"));
        System.out.println(balance.xyBalance("aaxbb"));
        System.out.println(balance.xyBalance("yaaxbb"));
    }
}
