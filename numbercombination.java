public class numbercombination {
    public static void main(String[] args) {
        perm("" , "24");
    }
    static void perm(String p ,String up){
    if(up.isEmpty()){
    System.out.println(p);
    return;
    }
    int digit = up.charAt(0) - '0';
    for(int i = (digit - 1)*3; i < digit*3 ; i++){
    char ch = (char) (i + 'a');
    perm(p + ch , up.substring(1));
    }
  }
}
