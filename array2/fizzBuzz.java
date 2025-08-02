import java.util.Arrays;

public class fizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        int length = end - start;
        String[] result = new String[length];
        for(int i = 0; i < length; i++){
            int num = start + i;
            if(num % 15 == 0){
                result[i] = "FizzBuzz";
            }else if (num % 3 == 0){
                result[i] = "Fizz";
            }else if (num % 5 == 0){
                result[i] = "Buzz";
            }else{
                result[i] = String.valueOf(num);
            }
        }

        return result;
    }

    //fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
    //fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
    //fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
    public static void main(String[]args){
        fizzBuzz buzz = new fizzBuzz();
        System.out.println(Arrays.toString(buzz.fizzBuzz(1, 6)));
        System.out.println(Arrays.toString(buzz.fizzBuzz(1, 8)));
        System.out.println(Arrays.toString(buzz.fizzBuzz(1, 11)));
    }
}
