public class makeTags {
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

    //makeTags("i", "Yay") → "<i>Yay</i>"
    //makeTags("i", "Hello") → "<i>Hello</i>"
    //makeTags("cite", "Yay") → "<cite>Yay</cite>"
    public static void main(String[]args){
        makeTags tag = new makeTags();
        System.out.println(tag.makeTags("i", "Yay"));
        System.out.println(tag.makeTags("i", "Hello"));
        System.out.println(tag.makeTags("i", "Yay"));
    }

}
