package AgainRepeat.OOP.exercises;

import java.util.ArrayList;

public class ExWithNestedClasses3 {
    public static void main(String[] args) {
        School school = new School();
        school.display();
    }
}


class School {
    void display() {
        class DaySchedule {

            String name;
            ArrayList<String> subjects = new ArrayList<>();

            void showSchedule() {
                System.out.println(name + ": " + subjects.toString());
            }
            @Override
            public String toString() {
                for (String subject : subjects) {
                    System.out.println(subject + ": " + subject);
                }
                return null;
            }



        }
        DaySchedule daySchedule = new DaySchedule();
        daySchedule.name = "Monday";
        daySchedule.subjects.add("Math");
        daySchedule.subjects.add("Programming");
        daySchedule.subjects.add("Geography");
        daySchedule.showSchedule();

    }
}