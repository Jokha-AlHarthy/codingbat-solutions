public class bunnyEars2 {
    public int bunnyEars2(int bunnies) {
        if(bunnies == 0){
            return 0;
        }else if(bunnies % 2 == 0){
            return 3 + bunnyEars2(bunnies - 1);
        }else{
            return 2 + bunnyEars2(bunnies - 1);
        }
    }

    //bunnyEars2(0) → 0
    //bunnyEars2(1) → 2
    //bunnyEars2(2) → 5
    public static void main(String[]args){
        bunnyEars2 bunny = new bunnyEars2();
        System.out.println(bunny.bunnyEars2(0));
        System.out.println(bunny.bunnyEars2(1));
        System.out.println(bunny.bunnyEars2(2));
    }
}
