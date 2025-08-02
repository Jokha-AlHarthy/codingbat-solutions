public class cigarPart {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend){
            return cigars >= 40;
        }else{
            return cigars >= 40 && cigars <= 60;
        }
    }

    //cigarParty(30, false) → false
    //cigarParty(50, false) → true
    //cigarParty(70, true) → true
    public static void main(String[]args){
        cigarPart part = new cigarPart();
        System.out.println(part.cigarParty(30, false));
        System.out.println(part.cigarParty(50, false));
        System.out.println(part.cigarParty(70, true));
    }
}
