public class mixStart {
    public boolean mixStart(String str) {
        if (str.length() >= 3) {
            if (str.charAt(1) == 'i' && str.charAt(2) == 'x') {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    //mixStart("mix snacks") → true
    //mixStart("pix snacks") → true
    //mixStart("piz snacks") → false
    public static void main(String[]args){
        mixStart mix = new mixStart();
        System.out.println(mix.mixStart("mix snacks"));
        System.out.println(mix.mixStart("pix snacks"));
        System.out.println(mix.mixStart("piz snacks"));
    }

}
