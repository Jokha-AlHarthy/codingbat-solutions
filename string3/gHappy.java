public class gHappy {
    public boolean gHappy(String str) {
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'g'){
                boolean left = (i > 0 && str.charAt(i - 1) == 'g');
                boolean right = (i < str.length() - 1 && str.charAt(i + 1) == 'g');
                if(!left && !right){
                    return false;
                }
            }
        }
        return true;
    }

    //gHappy("xxggxx") → true
    //gHappy("xxgxx") → false
    //gHappy("xxggyygxx") → false
    public static void main(String[]args){
        gHappy happy = new gHappy();
        System.out.println(happy.gHappy("xxggxx"));
        System.out.println(happy.gHappy("xxgxx"));
        System.out.println(happy.gHappy("xxggyygxx"));
    }
}
