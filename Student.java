package studennt_ver5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Student extends Person {

    float gpa;
    String major;

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Student() {
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

   
   public void addStudent() {
        Scanner scanner=new Scanner(System.in);
       System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter student full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter student date of birth: ");
        String dobString = scanner.nextLine();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        try {
            setDateOfBirth(sdf.parse(dobString));
            
        } catch (Exception e) {
            System.out.println("Wrong fomat");
        }
        System.out.print("Enter book borrow date (as timestamp): ");
        long borrowDate = scanner.nextLong();
        System.out.print("Enter book return date (as timestamp): ");
        long returnDate = scanner.nextLong();
        System.out.print("Enter student GPA: ");
        float gpa = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Enter student major: ");
        String major = scanner.nextLine();
        System.out.println("Student added successfully!");
        
   }
   public void updateStudent(String id){
       
   }
   
    @Override
     public void displayInfo() {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
       System.out.println("Student ID: " + getId());
        System.out.println("Name: " + getFullName());
        System.out.println("Date Of Birth: "+sdf.format(dateOfBirth));
        System.out.println("GPA: " + getGpa());
        System.out.println("Major: " + getMajor());
    }
}
