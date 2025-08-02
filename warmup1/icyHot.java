public class icyHot {
    public boolean icyHot(int temp1, int temp2) {
        if(temp1 < 0 && temp2 > 100){
            return true;
        }else if(temp2 < 0 && temp1 > 100){
            return true;
        }else{
            return false;
        }
    }

    //icyHot(120, -1) → true
    //icyHot(-1, 120) → true
    //icyHot(2, 120) → false
    public static void main(String[]args){
        icyHot temp = new icyHot();
        System.out.println(temp.icyHot(120, -1));
        System.out.println(temp.icyHot(-1, 120));
        System.out.println(temp.icyHot(2, 120));
    }
}
