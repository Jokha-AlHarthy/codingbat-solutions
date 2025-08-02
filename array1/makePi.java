import java.util.Arrays;

public class makePi {
    public int[] makePi() {
        return new int[]{3,1,4};
    }

    //makePi() → [3, 1, 4]
    public static void main(String[]args){
        makePi num = new makePi();
        System.out.println(Arrays.toString(num.makePi()));
    }
}
