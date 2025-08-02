import java.util.Arrays;

public class fizzArray2 {
    public String[] fizzArray2(int n){
        String[] result = new String[n];
        for(int i = 0; i < n; i++){
            result[i] = String.valueOf(i);
        }
        return result;
    }

    //fizzArray2(4) → ["0", "1", "2", "3"]
    //fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
    //fizzArray2(2) → ["0", "1"]
    public static void main(String[]args){
        fizzArray2 fizz = new fizzArray2();
        System.out.println(Arrays.toString(fizz.fizzArray2(4)));
        System.out.println(Arrays.toString(fizz.fizzArray2(10)));
        System.out.println(Arrays.toString(fizz.fizzArray2(2)));
    }
}
