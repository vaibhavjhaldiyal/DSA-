import java.util.*;
public class returnINarraylis {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        ans = perm("" , "abc");
        System.out.println(ans);
    }
    static List<String> perm(String p ,String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();
        for(int i = 0; i <= p.length(); i++){
            String c = p.substring(0,i);
            String f = p.substring(i, p.length());
            ans.addAll(perm(c + ch + f , up.substring(1)));
        }
       return ans;
    } 
}
