public class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
    
    public static void main(String[] args) {
        Student student = new Student("Vaibhav", 20);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        
        // Modifying values using setters
        student.setName("Anmol");
        student.setAge(22);
        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());
    }
}