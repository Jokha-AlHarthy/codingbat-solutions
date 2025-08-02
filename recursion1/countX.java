public class countX {
    public int countX(String str) {
        if(str.length() == 0){
            return 0;
        }else if(str.charAt(0) == 'x'){
            return 1 + countX(str.substring(1));
        }else{
            return countX(str.substring(1));
        }
    }

    //countX("xxhixx") → 4
    //countX("xhixhix") → 3
    //countX("hi") → 0
    public static void main(String[]args){
        countX count = new countX();
        System.out.println(count.countX("xxhixx"));
        System.out.println(count.countX("xhixhix"));
        System.out.println(count.countX("hi"));
    }
}
