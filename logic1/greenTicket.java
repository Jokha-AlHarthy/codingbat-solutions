public class greenTicket {
    public int greenTicket(int a, int b, int c) {
        if(a==b && b==c){
            return 20;
        }else if(a==b || a==c || b==c){
            return 10;
        }else{
            return 0;
        }
    }

    //greenTicket(1, 2, 3) → 0
    //greenTicket(2, 2, 2) → 20
    //greenTicket(1, 1, 2) → 10
    public static void main(String[]args){
        greenTicket ticket = new greenTicket();
        System.out.println(ticket.greenTicket(1, 2, 3));
        System.out.println(ticket.greenTicket(2, 2, 2));
        System.out.println(ticket.greenTicket(1, 1, 2));
    }
}
