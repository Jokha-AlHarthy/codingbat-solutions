public class bunnyEars {
    public int bunnyEars(int bunnies) {
        if(bunnies==0){
            return 0;
        }else{
            return 2 + bunnyEars(bunnies - 1);
        }
    }

    //bunnyEars(0) → 0
    //bunnyEars(1) → 2
    //bunnyEars(2) → 4
    public static void main(String[]args){
        bunnyEars bunny = new bunnyEars();
        System.out.println(bunny.bunnyEars(0));
        System.out.println(bunny.bunnyEars(1));
        System.out.println(bunny.bunnyEars(2));
    }
}
