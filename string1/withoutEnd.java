public class withoutEnd {
    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }

    //withoutEnd("Hello") → "ell"
    //withoutEnd("java") → "av"
    //withoutEnd("coding") → "odin"
    public static void main (String[]args){
        withoutEnd end = new withoutEnd();
        System.out.println(end.withoutEnd("Hello"));
        System.out.println(end.withoutEnd("java"));
        System.out.println(end.withoutEnd("coding"));
    }

}
