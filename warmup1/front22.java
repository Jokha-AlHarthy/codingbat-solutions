public class front22 {
    public String front22(String str) {
        int take = 2;
        if(take > str.length()){
            take = str.length();
        }
        String frist = str.substring(0, take);
        return frist + str + frist;
    }

    //front22("kitten") → "kikittenki"
    //front22("Ha") → "HaHaHa"
    //front22("abc") → "ababcab"
    public static void main(String[]args){
        front22 string = new front22();
        System.out.println(string.front22("kitten"));
        System.out.println(string.front22("Ha"));
        System.out.println(string.front22("abc"));
    }
}
