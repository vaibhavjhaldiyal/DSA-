import java.util.*;
public class permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> res = permu(arr);
        for(List<Integer> i : res){
            System.out.println(i);
        } 
    }
    static List<List<Integer>> permu(int arr[]){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<Integer>());
        for(int num : arr){
            int n = outer.size();
            for(int i = 0 ; i < n ; i++){
            List<Integer> inner = new ArrayList<>(outer.get(i));
            inner.add(num);
            outer.add(inner);
            }
        }
     return outer;
    }
}
