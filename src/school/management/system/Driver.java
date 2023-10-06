package school.management.system;

import java.util.Scanner;

/**
 * This class is the driver class which runs the application
 */
public class Driver
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    while (true)
    {
      int option;

      while (true)
      {
        System.out.print("""
            What would you like to do?
            1. Add a new teacher
            2. Add a new student
            3. Update teacher salary
            4. Update student fees
            """);

        // Check if the input is an integer
        if (scanner.hasNextInt())
        {
          option = scanner.nextInt();

          // Check if the input is within the valid range
          if (option >= 1 && option <= 4)
          {
            System.out.println("You entered: " + option);
            break; // Exit the loop if the input is valid
          }
          else
          {
            System.out.println("Invalid input. Please enter an integer between 1 and 4.");
          }
        }
        else
        {
          // Consume the invalid input to prevent an infinite loop
          scanner.next();
          System.out.println("Invalid input. Please enter an integer between 1 and 4.");
        }
      }

      switch (option)
      {
        // Case 1: Add a new teacher
        case 1:
          // Collect the teacher's name
          System.out.println("Enter the teacher's name: ");
          scanner.nextLine();
          String teacherName = scanner.nextLine();

          // Collect the teacher's salary
          System.out.println("Enter the teacher's salary: ");
          int teacherSalary = scanner.nextInt();

          // Collect the teacher's id
          int teacherID = School.generateRandomID();

          // Create a new Teacher instance and add it to the ArrayList
          Teacher teacher = new Teacher(teacherID, teacherName, teacherSalary);
          School.addTeacher(teacher);

          System.out.println("Teacher added!");

          break;

        // Case 2: Add a new student
        case 2:
          // Collect the student's name
          System.out.println("Enter the student's name: ");
          scanner.nextLine();
          String studentName = scanner.nextLine();

          // Collect the student's id
          int studentID = School.generateRandomID();

          // Collect the student's grade
          System.out.println("Enter the student's grade: ");
          int studentGrade = scanner.nextInt();

          // Create a new Student instance and add it to the ArrayList
          Student student = new Student(studentID, studentName, studentGrade);
          School.addStudent(student);

          System.out.println("Student added!");

          break;

        // Case 3: Update a teacher's salary
        case 3:
          // If there aren't any teachers in the system, notify user of the error
          if (School.getNumTeachers() == 0)
          {
            System.out.println("Error: No Teachers to Update");
            break;
          }
          else
          {
            System.out.println("Select which teacher's salary you would like to update: ");

            // Traverses the list of teachers and prints each teacher's name in numbered order
            for (int i = 0; i < School.getNumTeachers(); i++)
            {
              System.out.println((i + 1) + ". " + School.getTeachers().get(i).getName());
            }
            int numTeacherToUpdate = scanner.nextInt();
            System.out.println("Enter the updated salary: ");
            int newSalary = scanner.nextInt();
            // Sets aside the teacher to update and sets the new salary
            Teacher teacherToUpdate = School.getTeachers().get(numTeacherToUpdate - 1);
            teacherToUpdate.setSalary(newSalary);
          }
      }

      System.out.println();
      // Asks the user if they want to do anything else
      System.out.println("Do you want to do anything else?\n1. Yes\n2. No");
      int response = scanner.nextInt();

      // Validates user input
      while (response != 1 && response != 2)
      {
        System.out.println("Invalid input");
        System.out.println("Do you want to do anything else?");
        response = scanner.nextInt();
      }

      if (response == 2)
      {
        break;
      }
    }

    System.out.println("********************");
    System.out.println("List of teachers:");
    for (Teacher teacher : School.getTeachers())
    {
      System.out.print("*Name: " + teacher.getName());
      System.out.print(" *ID: " + teacher.getId());
      System.out.println(" *Salary: " + teacher.getSalary());
      System.out.println("--------------------");
    }
    System.out.println("********************");
    System.out.println("List of students:");
    for (Student student : School.getStudents())
    {
      System.out.print("*Name: " + student.getName());
      System.out.print(" *ID: " + student.getId());
      System.out.println(" *Grade: " + student.getGrade());
      System.out.println("--------------------");
    }
    System.out.print("Thank you for using ShpakovSchools® LMS");
  }

}
