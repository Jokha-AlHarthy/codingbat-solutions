public class teaParty {
    public int teaParty(int tea, int candy) {
        if(tea < 5 || candy <5){
            return 0;
        }else if(tea >= 2 * candy || candy >= 2 * tea){
            return 2;
        }else{
            return 1;
        }
    }

    //teaParty(6, 8) → 1
    //teaParty(3, 8) → 0
    //teaParty(20, 6) → 2
    public static void main(String[]args){
        teaParty party = new teaParty();
        System.out.println(party.teaParty(6, 8));
        System.out.println(party.teaParty(3, 8));
        System.out.println(party.teaParty(20, 6));
    }
}
