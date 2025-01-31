public class numberoftime {
    public static void main(String[] args) {
        printcomb("", 4);
    }
   static  void printcomb(String p , int target){
    if(target == 0){
        System.out.println(p);
        return;
    }
    for(int i = 1; i <= target; i++){
        printcomb(p + i, target - i);

    }
   }
}
