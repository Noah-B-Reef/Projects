public class Student {
    
   private String name;
   private String major;
   private double gpa;
  
   
   public Student(String name, String major, double gpa)
   {
    this.name = name;
    this.major = major;
    this.gpa = gpa;
   }
   public Student()
   {
     this("Mary Ann", "CE", 3.5);
   }

   public Student(String name, String major)
   {
        this(name, major, 3.5);
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString()
    {
        return "Name: " + name + "\nMajor: " + major + "\nGPA: " + gpa;
    }

    public boolean eqauls(Student student)
    {
        if (student == this)
        {
            return true;
        }

        else{
            return false;
        }
    }


}
