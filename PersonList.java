package studennt_ver5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PersonList {

    ArrayList<Person> personList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void updateStudent(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                System.out.println("Enter new full name: ");
                person.setFullName(scanner.nextLine());
                System.out.print("Enter new student full name: ");
                String fullName = scanner.nextLine();
                System.out.print("Enter new student date of birth: ");
                String dobString = scanner.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    person.setDateOfBirth(sdf.parse(dobString));

                } catch (Exception e) {
                    System.out.println("Wrong fomat");
                }
                System.out.print("Enter new book borrow date (as timestamp): ");
                long borrowDate = scanner.nextLong();
                System.out.print("Enter new book return date (as timestamp): ");
                long returnDate = scanner.nextLong();
                System.out.print("Enter new student GPA: ");
                float gpa = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("Enter new student major: ");
                String major = scanner.nextLine();
                System.out.println("Student successfully!");

            }
        }
        System.out.println("Student not found!");
    }
public void updateTeacher(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                System.out.println("Enter new full name: ");
                person.setFullName(scanner.nextLine());
                System.out.print("Enter new Teacher full name: ");
                String fullName = scanner.nextLine();
                System.out.print("Enter new Teacher date of birth: ");
                String dobString = scanner.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    person.setDateOfBirth(sdf.parse(dobString));

                } catch (Exception e) {
                    System.out.println("Wrong fomat");
                }
                System.out.print("Enter new book borrow date (as timestamp): ");
                long borrowDate = scanner.nextLong();
                System.out.print("Enter new book return date (as timestamp): ");
                long returnDate = scanner.nextLong();
                System.out.print("Enter new department: ");
                float gpa = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("Enter new Teaching Subject: ");
                String major = scanner.nextLine();
                System.out.println("Teacher successfully!");

            }
        }
        System.out.println("Person not found!");
    }
    public Person findPersonById(String id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equals(id)) {
                return personList.get(i);
            }
        }
        return null;
    }
}
