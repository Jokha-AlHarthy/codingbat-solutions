public class changeXY {
    public String changeXY(String str) {
        if(str.length()==0){
            return "";
        }
        char first = str.charAt(0);
        if(first=='x'){
            return 'y'+changeXY(str.substring(1));
        }else{
            return first+changeXY(str.substring(1));
        }
    }

    //changeXY("codex") → "codey"
    //changeXY("xxhixx") → "yyhiyy"
    //changeXY("xhixhix") → "yhiyhiy"
    public static void main(String[]args){
        changeXY xy = new changeXY();
        System.out.println(xy.changeXY("codex"));
        System.out.println(xy.changeXY("xxhixx"));
        System.out.println(xy.changeXY("xhixhix"));
    }
}
