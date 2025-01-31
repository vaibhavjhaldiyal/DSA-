import java.util.*;
public class mazeproblem {
    public static void main(String[] args) {
      //System.out.println(maze(2,2));
     // maze2("" , 3 ,3);
      System.out.println(maze3("" , 3 ,3));

        
    }
    static int maze(int r , int c){
        if(c == 1 || r == 1){
            return 1;
        }
        int left = maze(r -1 , c);
        int right = maze(r , c -1);
        return left + right;
    }
    static void maze2(String d ,int r , int c){
        if(c == 1 && r == 1 ){
         System.out.println(d);
         return;
        }
          if(r > 1){
            maze2( d +'D',r -1 , c);
          }
          if(c > 1){
            maze2(d +'R' ,r , c -1);
          } 
    }
    static List<String> maze3(String d ,int r , int c){
        if(c == 1 && r == 1 ){
         List<String> list = new ArrayList<>();
         list.add(d);
         return list;
        }
        List<String> res = new ArrayList<>();
          if(r > 1){
            res.addAll(maze3( d +'D',r -1 , c));
          }
          if(r > 1 && c > 1){
            res.addAll(maze3( d +'A',r -1 , c -1));
          }
          if(c > 1){
            res.addAll(maze3(d +'R' ,r , c -1));
          } 
          return res;
    }
}
