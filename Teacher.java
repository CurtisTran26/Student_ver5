package studennt_ver5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher(String department, String teachingSubject, String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher(String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }


    public void addTeacher() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter teacher ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter teacher full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter teacher date of birth: ");
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
        scanner.nextLine();  // Consume newline
        System.out.print("Enter teacher department: ");
        String department = scanner.nextLine();
        System.out.print("Enter teacher teaching subject: ");
        String subject = scanner.nextLine();
        System.out.println("Teacher added successfully!");
    }

    @Override
    public void updatePerson(String id) {

    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf=new SimpleDateFormat();
        System.out.println("Teacher ID: " + getId());
        System.out.println("Name: " + getFullName());
        System.out.println("Date Of Birth: "+sdf.format(dateOfBirth));
        System.out.println("Department: " + department);
        System.out.println("Teaching Subject: " + teachingSubject);
    }
}
