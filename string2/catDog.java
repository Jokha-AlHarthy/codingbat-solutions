public class catDog {
    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for(int i = 0; i < str.length() - 2; i++){
            String sub = str.substring(i, i + 3);
            if(sub.equals("cat")){
                catCount++;
            }else if(sub.equals("dog")){
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

    //catDog("catdog") → true
    //catDog("catcat") → false
    //catDog("1cat1cadodog") → true
    public static void main(String[]args){
        catDog animal = new catDog();
        System.out.println(animal.catDog("catdog"));
        System.out.println(animal.catDog("catcat"));
        System.out.println(animal.catDog("1cat1cadodog"));
    }
}
