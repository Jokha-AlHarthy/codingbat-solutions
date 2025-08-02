public class altPairs {
    public String altPairs(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i += 4){
            int end = i + 2;
            if(end > str.length()){
                end = str.length();
            }
            result.append(str.substring(i, end));
        }
        return result.toString();
    }

    //altPairs("kitten") → "kien"
    //altPairs("Chocolate") → "Chole"
    //altPairs("CodingHorror") → "Congrr"
    public static void main(String[]args){
        altPairs pairs = new altPairs();
        System.out.println(pairs.altPairs("kitten"));
        System.out.println(pairs.altPairs("Chocolate"));
        System.out.println(pairs.altPairs("CodingHorror"));
    }
}
