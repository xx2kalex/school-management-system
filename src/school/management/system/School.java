package school.management.system;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class models a School object which consists of teachers and students
 */
// TODO - consider making this class static
public class School
{
  private static ArrayList<Teacher> teachers = new ArrayList<>();
  private static ArrayList<Student> students = new ArrayList<>();
  private int totalMoneyEarned;
  private int totalMoneySpent;

  public static ArrayList<Teacher> getTeachers()
  {
    return teachers;
  }

  public static void setTeachers(ArrayList<Teacher> teachers)
  {
    School.teachers = teachers;
  }

  public static ArrayList<Student> getStudents()
  {
    return students;
  }

  public static void setStudents(ArrayList<Student> students)
  {
    School.students = students;
  }

  public int getTotalMoneyEarned()
  {
    return totalMoneyEarned;
  }

  public void setTotalMoneyEarned(int totalMoneyEarned)
  {
    this.totalMoneyEarned = totalMoneyEarned;
  }

  public int getTotalMoneySpent()
  {
    return totalMoneySpent;
  }

  public void setTotalMoneySpent(int totalMoneySpent)
  {
    this.totalMoneySpent = totalMoneySpent;
  }

  /**
   * Adds the passed Teacher object to the local ArrayList of teachers
   *
   * @param teacher - Teacher object passed in
   */
  public static void addTeacher(Teacher teacher)
  {
    teachers.add(teacher);
  }

  /**
   * Adds the passed Student object to the local ArrayList of students
   *
   * @param student - Student object passed in
   */
  public static void addStudent(Student student)
  {
    students.add(student);
  }

  /**
   * Returns the number of teachers in the local ArrayList of teachers
   * @return - the number of teachers in the local ArrayList of teachers
   */
  public static int getNumTeachers()
  {
    return teachers.size();
  }

  /**
   * Generates a random 5-digit ID number for either a teacher or student
   *
   * @return - A random 5-digit ID number
   */
  public static int generateRandomID()
  {
    Random random = new Random();
    int min = 10000; // Minimum 5-digit number
    int max = 99999; // Maximum 5-digit number
    return random.nextInt(max - min + 1) + min;
  }


}
