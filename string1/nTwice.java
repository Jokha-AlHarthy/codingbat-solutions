public class nTwice {
    public String nTwice(String str, int n) {
        return str.substring(0,n)+str.substring(str.length()-n);
    }

    //nTwice("Hello", 2) → "Helo"
    //nTwice("Chocolate", 3) → "Choate"
    //nTwice("Chocolate", 1) → "Ce"
    public static void main(String[]args){
        nTwice n = new nTwice();
        System.out.println(n.nTwice("Hello", 2));
        System.out.println(n.nTwice("Chocolate", 3));
        System.out.println(n.nTwice("Chocolate", 1));
    }
}
