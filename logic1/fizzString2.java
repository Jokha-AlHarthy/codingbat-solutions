public class fizzString2 {
    public String fizzString2(int n) {
        if(n % 3 == 0 && n % 5 == 0){
            return "FizzBuzz!";
        }else if(n % 3 == 0){
            return "Fizz!";
        }else if(n % 5 == 0){
            return "Buzz!";
        }else{
            return n + "!";
        }
    }

    //fizzString2(1) → "1!"
    //fizzString2(2) → "2!"
    //fizzString2(3) → "Fizz!"
    public static void main(String[]args){
        fizzString2 fizz2 = new fizzString2();
        System.out.println(fizz2.fizzString2(1));
        System.out.println(fizz2.fizzString2(2));
        System.out.println(fizz2.fizzString2(3));
    }
}
