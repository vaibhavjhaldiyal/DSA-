public class Rectangle {
    private double length;
    private double width;
    
    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0); // Example values
        System.out.println("Area of the rectangle: " + rect.calculateArea());
    }
}
