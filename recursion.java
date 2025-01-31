class recursion{
    public static void main(String[] args){
        System.out.println(0);
        System.out.println(1);
        fibonacci(0 , 1 , 9 , 0);
    }
    static void fibonacci(int i , int j, int n , int count){
        if(n - 2 == count){
            return;
        }
       int temp = i + j;
       i = j;
       j = temp;
       count++;
       System.out.println(temp);
       fibonacci(j,temp, n, count);

    }
}