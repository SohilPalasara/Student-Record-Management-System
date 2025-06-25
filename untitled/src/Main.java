import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();

                    students.add(new Student(id, name, marks));
                    System.out.println("Student added successfully.");
                }

                case 2 -> {
                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                }

                case 3 -> {
                    System.out.print("Enter ID to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Student foundStudent = students.stream()
                            .filter(student -> student.getStudentId() == id)
                            .findFirst()
                            .orElse(null);

                    boolean found = false;
                    for (Student student : students) {
                        if (student.getStudentId() == id) {
                            System.out.print("Enter new name: ");
                            String newName = scanner.nextLine();
                            System.out.print("Enter new marks: ");
                            double newMarks = scanner.nextDouble();

                            student.setName(newName);
                            student.setMarks(newMarks);

                            System.out.println("Student updated successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                }

                case 4 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = scanner.nextInt();
                    boolean removed = false;

                    for (Student student : students) {
                        if (student.getStudentId() == id) {
                            students.remove(student);
                            System.out.println("Student deleted successfully.");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student not found.");
                    }
                }

                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}



