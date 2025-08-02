public class doubleX {
    boolean doubleX(String str) {
        int index = str.indexOf("x");
        if(index == -1 || index + 1 >= str.length()){
            return false;
        }
        return str.charAt(index + 1) == 'x';
    }

    //doubleX("axxbb") → true
    //doubleX("axaxax") → false
    //doubleX("xxxxx") → true
    public static void main(String[]args){
        doubleX x = new doubleX();
        System.out.println(x.doubleX("axxbb"));
        System.out.println(x.doubleX("axaxax"));
        System.out.println(x.doubleX("xxxxx"));
    }
}
