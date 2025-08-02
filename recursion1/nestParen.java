public class nestParen {
    public boolean nestParen(String str) {
        if(str.length() == 0){
            return true;
        }else if(str.length() < 2){
            return false;
        }else if(str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')'){
            return nestParen(str.substring(1, str.length() - 1));
        }else{
            return false;
        }
    }

    //nestParen("(())") → true
    //nestParen("((()))") → true
    //nestParen("(((x))") → false
    public static void main(String[]args){
        nestParen nested = new nestParen();
        System.out.println(nested.nestParen("(())"));
        System.out.println(nested.nestParen("((()))"));
        System.out.println(nested.nestParen("(((x)))"));
    }
}
