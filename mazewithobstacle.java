
import java.util.*;

public class mazewithobstacle {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true,true},
            {false , false, true,true},
            {true, true, false ,true}
        };
        System.out.println(MWO("", board, 0, 0));
    }
    static List<String> MWO(String s , boolean[][] mat , int r, int c){
     if(r == mat.length - 1 && c == mat[0].length - 1){
        List<String> list = new ArrayList<>();
        list.add(s);
        return list;
     }
     if(!mat[r][c]){
        return new ArrayList<>();
     }
     List<String> result = new ArrayList<>();
     if(r < mat.length - 1){
          result.addAll(MWO(s + "D" , mat , r + 1 , c));
     }
     if(c < mat[0].length - 1){
        result.addAll(MWO(s + "R" , mat , r , c + 1));
     }
     return result;
    }
}
