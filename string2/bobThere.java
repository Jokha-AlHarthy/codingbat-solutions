public class bobThere {
    public boolean bobThere(String str) {
        for(int i = 0; i < str.length() - 2; i++){
            if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'){
                return true;
            }
        }
        return false;
    }

    //bobThere("abcbob") → true
    //bobThere("b9b") → true
    //bobThere("bac") → false
    public static void main(String[]args){
        bobThere bob = new bobThere();
        System.out.println(bob.bobThere("abcbob"));
        System.out.println(bob.bobThere("b9b"));
        System.out.println(bob.bobThere("bac"));
    }
}
