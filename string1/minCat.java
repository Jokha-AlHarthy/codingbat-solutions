public class minCat {
    public String minCat(String a, String b) {
        if(a.length() > b.length()){
            a = a.substring(a.length() - b.length());
        }else if(b.length() > a.length()){
            b = b.substring(b.length() - a.length());
        }
        return a + b;
    }

    //minCat("Hello", "Hi") → "loHi"
    //minCat("Hello", "java") → "ellojava"
    //minCat("java", "Hello") → "javaello"
    public static void main(String[]args){
        minCat min = new minCat();
        System.out.println(min.minCat("Hello", "Hi"));
        System.out.println(min.minCat("Hello", "java"));
        System.out.println(min.minCat("java", "Hello"));
    }
}
