public class premrecursion {
    public static void main(String[] args) {
        perm("" , "abc");
    }
    static void perm(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String c = p.substring(0,i);
            String f = p.substring(i, p.length());
            perm(c + ch + f , up.substring(1));
        }

    } 
    
}
