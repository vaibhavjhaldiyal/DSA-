import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int r = sc.nextInt();
        double area = 2*22/7*r;
        System.out.println("Area of the circle is :" + area);
        }
    
}
