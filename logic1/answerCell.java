public class answerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep){
            return false;
        }else if(isMorning && !isMom){
            return false;
        }else{
            return true;
        }
    }

    //answerCell(false, false, false) → true
    //answerCell(false, false, true) → false
    //answerCell(true, false, false) → false
    public static void main(String[]args){
        answerCell answer = new answerCell();
        System.out.println(answer.answerCell(false, false, false));
        System.out.println(answer.answerCell(false, false, true));
        System.out.println(answer.answerCell(true, false, false));
    }
}
