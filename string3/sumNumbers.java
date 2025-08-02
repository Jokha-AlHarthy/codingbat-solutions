public class sumNumbers {
    public int sumNumbers(String str) {
        int sum = 0;
        StringBuilder number = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                number.append(ch);
            }else{
                if(number.length() > 0){
                    sum += Integer.parseInt(number.toString());
                    number.setLength(0);
                }
            }
        }
        if(number.length() > 0){
            sum += Integer.parseInt(number.toString());
        }
        return sum;
    }

    //sumNumbers("abc123xyz") → 123
    //sumNumbers("aa11b33") → 44
    //sumNumbers("7 11") → 18
    public static void main(String[]args){
        sumNumbers num = new sumNumbers();
        System.out.println(num.sumNumbers("abc123xyz"));
        System.out.println(num.sumNumbers("aa11b33"));
        System.out.println(num.sumNumbers("7 11"));
    }

}
