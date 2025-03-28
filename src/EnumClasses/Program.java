package EnumClasses;

public class Program {
    public static void main(String[] args) {
        Day currentDay = Day.MONDAY;
        System.out.println(currentDay);
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
