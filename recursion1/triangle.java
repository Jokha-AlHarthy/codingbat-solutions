public class triangle {
    public int triangle(int rows) {
        if(rows == 0){
            return 0;
        }else{
            return rows + triangle(rows - 1);
        }
    }

    //triangle(0) → 0
    //triangle(1) → 1
    //triangle(2) → 3
    public static void main(String[]args){
        triangle angle = new triangle();
        System.out.println(angle.triangle(0));
        System.out.println(angle.triangle(1));
        System.out.println(angle.triangle(2));
    }
}
