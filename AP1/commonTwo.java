public class commonTwo {
    public int commonTwo(String[] a, String[] b) {
        int i=0;
        int j=0;
        int count=0;
        String lastCounted = "";
        while (i <a.length && j < b.length){
            int compare = a[i].compareTo(b[j]);
            if(compare == 0){
                if(!a[i].equals(lastCounted)){
                    count++;
                    lastCounted =a[i];
                }
                i++;
                j++;
            }else if(compare<0){
                i++;
            }else{
                j++;
            }
        }
        return count;
    }

    //commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
    //commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
    //commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
    public static void main(String[]args){
        commonTwo common = new commonTwo();
        System.out.println(common.commonTwo(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"}));
        System.out.println(common.commonTwo(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"}));
        System.out.println(common.commonTwo(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}));
    }
}
