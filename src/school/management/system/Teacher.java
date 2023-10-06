package school.management.system;

/**
 * This class models a Teacher object
 */
public class Teacher
{
  private int id;
  private String name;
  private int salary;

  /**
   * Constructor for a Teacher object
   */
  public Teacher(int id, String name, int salary)
  {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }

  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public int getSalary()
  {
    return salary;
  }

  public void setSalary(int salary)
  {
    this.salary = salary;
  }
}
