public class seeColor {
    public String seeColor(String str) {
        if(str.startsWith("red")){
            return "red";
        }else if(str.startsWith("blue")){
            return "blue";
        }else{
            return "";
        }
    }

    //seeColor("redxx") → "red"
    //seeColor("xxred") → ""
    //seeColor("blueTimes") → "blue"
    public static void main(String[]args){
        seeColor color = new seeColor();
        System.out.println(color.seeColor("redxx"));
        System.out.println(color.seeColor("xxred"));
        System.out.println(color.seeColor("blueTimes"));
    }
}
