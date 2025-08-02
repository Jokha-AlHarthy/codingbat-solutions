public class evenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int small = Math.min(a, Math.min(b, c));
        int large = Math.max(a, Math.max(b, c));
        int mid = a + b + c - small - large;
        return (mid - small) == (large - mid);
    }

    //evenlySpaced(2, 4, 6) → true
    //evenlySpaced(4, 6, 2) → true
    //evenlySpaced(4, 6, 3) → false
    public static void main(String[]args){
        evenlySpaced spaced = new evenlySpaced();
        System.out.println(spaced.evenlySpaced(2, 4, 6));
        System.out.println(spaced.evenlySpaced(4, 6, 2));
        System.out.println(spaced.evenlySpaced(4, 6, 3));
    }
}
