import java.util.Random;

public class Student {
    private int studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dob;


    public Student(String firstName, String middleName, String lastName, String dob) {
        this.studentId = generateRandomId();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
    }


    private int generateRandomId() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date of Birth: " + dob);
    }

    public static void main(String[] args) {
        // Creating 3 student instances
        Student student1 = new Student("Maria", "Melisa", "Roble", "01/06/1984");
        Student student2 = new Student("Omar", "Takeshi", "Perez", "02/02/1994");
        Student student3 = new Student("Jürgen", "Aaron", "Morales", "03/03/1992");

        System.out.println("Java assignment 2");
		
        student1.displayStudentDetails();
        System.out.println("-------------------------------");
        student2.displayStudentDetails();
        System.out.println("-------------------------------");
        student3.displayStudentDetails();
    }
}
