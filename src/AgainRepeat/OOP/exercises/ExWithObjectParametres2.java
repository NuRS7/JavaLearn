package AgainRepeat.OOP.exercises;

import java.util.ArrayList;
import java.util.List;

public class ExWithObjectParametres2 {
    public static void main(String[] args) {
        Student student = new Student("Nurs", 12);
        ClassRoom classRoom = new ClassRoom();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(new Student("L", 12));
        students.add(new Student("В", 15));
        students.add(new Student("Д", 14));
        students.add(new Student("С", 13));
        classRoom.printStudents(students);
    }
}

class Student {
    String name;
    int grade;
    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}


class ClassRoom {
    void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.name+ " " +student.grade);
        }
    }
}
