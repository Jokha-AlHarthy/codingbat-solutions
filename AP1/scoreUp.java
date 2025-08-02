public class scoreUp {
    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for(int i = 0; i < key.length; i++){
            if(answers[i].equals("?")){

            }else if(answers[i].equals(key[i])){
                score+=4;
            }else{
                score-=1;
            }
        }
        return score;
    }


    //scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
    //scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
    //scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
    public static void main(String[]args){
        scoreUp up = new scoreUp();
        System.out.println(up.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "c", "b", "c"}));
        System.out.println(up.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "c"}));
        System.out.println(up.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "b"}));
    }
}
