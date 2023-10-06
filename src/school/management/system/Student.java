package school.management.system;

/**
 * This class is responsible for keeping track of student data
 */
public class Student
{
  private int id;
  private String name;
  private int grade;
  private int feesPaid;
  private int feesTotal;

  /**
   * Constructor for Student object
   *
   * @param id    - unique student id
   * @param name  - name of the student
   * @param grade - grade of the student
   */
  public Student(int id, String name, int grade)
  {
    this.id = id;
    this.name = name;
    this.grade = grade;
    feesPaid = 0;
    feesTotal = 30000;
  }

  public void setFeesTotal(int feesTotal)
  {
    this.feesTotal = feesTotal;
  }

  public String getName()
  {
    return name;
  }

  public int getGrade()
  {
    return grade;
  }

  public int getFeesPaid()
  {
    return feesPaid;
  }

  public int getFeesTotal()
  {
    return feesTotal;
  }

  public int getId()
  {
    return id;
  }

  public void updateFeesPaid(int fees)
  {
    feesPaid += fees;
  }
}
