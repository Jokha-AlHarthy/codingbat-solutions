public class fizzString {
    public String fizzString(String str) {
        boolean startsWithF = str.startsWith("f");
        boolean endsWithB = str.endsWith("b");

        if(startsWithF && endsWithB){
            return "FizzBuzz";
        }else if(startsWithF){
            return "Fizz";
        }else if (endsWithB){
            return "Buzz";
        }else{
            return str;
        }
    }

    //fizzString("fig") → "Fizz"
    //fizzString("dib") → "Buzz"
    //fizzString("fib") → "FizzBuzz"
    public static void main(String[]args){
        fizzString fizz = new fizzString();
        System.out.println(fizz.fizzString("fig"));
        System.out.println(fizz.fizzString("dib"));
        System.out.println(fizz.fizzString("fib"));
    }
}
