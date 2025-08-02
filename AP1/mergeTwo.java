import java.util.Arrays;

public class mergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[]result = new String[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(k < n){
            if(a[i].compareTo(b[j])<0){
                result[k++] = a[i++];
            }else if(a[i].compareTo(b[j])>0){
                result[k++] = b[j++];
            }else{
                result[k++] = a[i];
                i++;
                j++;
            }
        }
        return result;
    }

    //mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
    //mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
    //mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
    public static void main(String[]args){
        mergeTwo merge = new mergeTwo();
        System.out.println(Arrays.toString(merge.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3)));
        System.out.println(Arrays.toString(merge.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3)));
        System.out.println(Arrays.toString(merge.mergeTwo(new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3)));
    }
}
