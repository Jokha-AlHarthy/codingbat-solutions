public class blueTicket {
    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if(ab == 10 || bc == 10 || ac == 10){
            return 10;
        }else if(ab == bc + 10 || ab == ac + 10){
            return 5;
        }else{
            return 0;
        }
    }

    //blueTicket(9, 1, 0) → 10
    //blueTicket(9, 2, 0) → 0
    //blueTicket(6, 1, 4) → 10
    public static void main(String[]args){
        blueTicket ticket = new blueTicket();
        System.out.println(ticket.blueTicket(9, 1, 0));
        System.out.println(ticket.blueTicket(9, 2, 0));
        System.out.println(ticket.blueTicket(6, 1, 4));
    }
}
