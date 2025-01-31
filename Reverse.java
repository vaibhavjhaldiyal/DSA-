public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9};
        int len = arr.length;
        int[] reverse = new int[len];
        int j = 0;
        for(int i = len -1 ; i >= 0 ; i--) {
            reverse[j] = arr[i];
            j++;
    }
    for(int n : reverse) {
        System.out.print(n +", ");
  }
}
}
