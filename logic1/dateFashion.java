public class dateFashion {
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2){
            return 0;
        }else if(you>= 8 || date >= 8){
            return 2;
        }else{
            return 1;
        }
    }

    //dateFashion(5, 10) → 2
    //dateFashion(5, 2) → 0
    //dateFashion(5, 5) → 1
    public static void main(String[]args){
        dateFashion date = new dateFashion();
        System.out.println(date.dateFashion(5, 10));
        System.out.println(date.dateFashion(5, 2));
        System.out.println(date.dateFashion(5, 5));
    }
}
