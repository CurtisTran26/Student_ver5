
package studennt_ver5;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find teachers by department");
            System.out.println("8. Check if a book is overdue");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    personList.addStudent();
                    break;

                case 2:
                    personList.addTeacher();
                    break;

                case 3:
                    System.out.print("Enter person ID to update: ");
                    String updateId = scanner.nextLine();
                    personList.updatePerson(updateId);
                    break;

                case 4:
                    System.out.print("Enter person ID to delete: ");
                    String deleteId = scanner.nextLine();
                    personList.deletePersonById(deleteId);
                    break;

                case 5:
                    personList.displayEveryone();
                    break;

                case 6:
                    Student topStudent = personList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Student with highest GPA:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students available.");
                    }
                    break;

                case 7:
                    System.out.print("Enter department to search for: ");
                    String department = scanner.nextLine();
                    Teacher foundTeacher = personList.findTeacherByDepartment(department);
                    if (foundTeacher != null) {
                        System.out.println("Teacher found:");
                        foundTeacher.displayInfo();
                    } else {
                        System.out.println("No teacher found in this department.");
                    }
                    break;

                case 8:
                    System.out.print("Enter person ID to check book borrowing: ");
                    String borrowId = scanner.nextLine();
                    personList.checkBookBorrowing(borrowId);
                    break;

                case 9:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);

        scanner.close();
    }
}

