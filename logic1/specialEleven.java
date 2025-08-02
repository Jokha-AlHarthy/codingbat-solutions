public class specialEleven {
    public boolean specialEleven(int n) {
        int mod = n % 11;
        if(mod == 0 || mod == 1){
            return true;
        }else{
            return false;
        }
    }

    //specialEleven(22) → true
    //specialEleven(23) → true
    //specialEleven(24) → false
    public static void main(String[]args){
        specialEleven specail = new specialEleven();
        System.out.println(specail.specialEleven(22));
        System.out.println(specail.specialEleven(23));
        System.out.println(specail.specialEleven(24));
    }
}
