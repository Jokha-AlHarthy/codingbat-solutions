public class getSandwich {
    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if(first == -1 || first == last){
            return "";
        }
        return str.substring(first + 5, last);
    }

    //getSandwich("breadjambread") → "jam"
    //getSandwich("xxbreadjambreadyy") → "jam"
    //getSandwich("xxbreadyy") → ""
    public static void main(String[]args){
        getSandwich sandwich = new getSandwich();
        System.out.println(sandwich.getSandwich("breadjambread"));
        System.out.println(sandwich.getSandwich("xxbreadjambreadyy"));
        System.out.println(sandwich.getSandwich("xxbreadyy"));
    }
}
