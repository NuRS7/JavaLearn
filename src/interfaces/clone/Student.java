package interfaces.clone;


import java.util.Date;

public class Student implements Cloneable {

    private String name;
    private int age;
    private Date year;

    public Student(String name, int age, Date year) {
        this.name = name;
        this.age = age;
        this.year = new Date();
    }
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", year=" + year + "]";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (name.isEmpty()) {
                throw new Exception("Name cannot be empty");
            }
            this.name = name;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        if (year == null) {
            throw new IllegalArgumentException("Year cannot be null");
        }
        this.year = year;

    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        try {
            Date date = new Date(System.nanoTime());
            Student student = new Student("Nurs", 21,date );
            System.out.println(student);
            Student student1 = (Student) student.clone();
            System.out.println(student1);
            System.out.println(student1.hashCode());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}


