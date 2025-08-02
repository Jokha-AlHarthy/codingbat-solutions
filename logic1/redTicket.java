public class redTicket {
    public int redTicket(int a, int b, int c) {
        if(a == 2 && b == 2 && c == 2){
            return 10;
        }else if(a == b && b == c){
            return 5;
        }else if(b != a && c != a){
            return 1;
        }else{
            return 0;
        }
    }

    //redTicket(2, 2, 2) → 10
    //redTicket(2, 2, 1) → 0
    //redTicket(0, 0, 0) → 5
    public static void main(String[]args){
        redTicket ticket = new redTicket();
        System.out.println(ticket.redTicket(2, 2, 2));
        System.out.println(ticket.redTicket(2, 2, 1));
        System.out.println(ticket.redTicket(0, 0, 0));
    }
}
