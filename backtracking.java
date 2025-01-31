import java.util.*;
public class backtracking {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true,true},
            {false , false, true,true},
            {true, true, true ,true},
            {false, true, true ,false},
            {true, true, true ,true}
        };
        int[][] path = new int[board.length][board[0].length];
        MWO2("", board, 0, 0, path , 1);
    }
    static void MWO(String s , boolean[][] mat , int r, int c){
     if(r == mat.length - 1 && c == mat[0].length - 1){
        System.out.println(s);
        return;
     }
     if(!mat[r][c]){
        return;
     }
     mat[r][c]= false;
    
     if(r < mat.length - 1){
          MWO(s + "D" , mat , r + 1 , c);
     }
     if(c < mat[0].length - 1){
       MWO(s + "R" , mat , r , c + 1);
     }
     if(r > 0){
        MWO(s + "U" , mat , r - 1, c );
      }
      if(c > 0){
        MWO(s + "L" , mat , r , c - 1);
      }
     mat[r][c]= true;
    }
    static void MWO2(String s , boolean[][] mat , int r, int c , int[][] path , int step){
        if(r == mat.length - 1 && c == mat[0].length - 1){
        path[r][c]= step;
        for(int[] i : path){
            System.out.println(Arrays.toString(i));
        }
           System.out.println(s);
           System.out.println();
           return;
        }
        if(!mat[r][c]){
           return;
        }
        mat[r][c]= false;
        path[r][c]= step;
       
        if(r < mat.length - 1){
             MWO2(s + "D" , mat , r + 1 , c , path , step + 1);
        }
        if(c < mat[0].length - 1){
          MWO2(s + "R" , mat , r , c + 1 , path , step + 1);
        }
        if(r > 0){
           MWO2(s + "U" , mat , r - 1, c , path , step + 1);
         }
         if(c > 0){
           MWO2(s + "L" , mat , r , c - 1 , path , step + 1);
         }
        mat[r][c]= true;
        path[r][c] = 0;
       }
}
