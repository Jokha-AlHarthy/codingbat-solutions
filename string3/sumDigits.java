public class sumDigits {
    public int sumDigits(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum += Integer.parseInt(String.valueOf(ch));
            }
        }
        return sum;
    }

    //sumDigits("aa1bc2d3") → 6
    //sumDigits("aa11b33") → 8
    //sumDigits("Chocolate") → 0
    public static void main(String[]args){
        sumDigits digits = new sumDigits();
        System.out.println(digits.sumDigits("aa1bc2d3"));
        System.out.println(digits.sumDigits("aa11b33"));
        System.out.println(digits.sumDigits("Chocolate"));
    }
}
