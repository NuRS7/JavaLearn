import java.util.Scanner;

public class Watch {
    private int hours;
    private int minutes;
    private int seconds;

    public Watch(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    public Watch() {
        this(0, 0, 0); // Вызываем главный конструктор
    }
    public Watch(int hours, int minutes) {
        this(hours, minutes, 0); // seconds по умолчанию 0
    }
    public Watch(int hours) {
        this(hours, 0, 0); // minutes и seconds по умолчанию 0
    }
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }
    public void update(int hours, int minutes, int seconds) {
        int totalSeconds = this.seconds + seconds;
        int totalMinutes = this.minutes + minutes + totalSeconds / 60;
        int totalHours = this.hours + hours + totalMinutes / 60;

        this.seconds = (totalSeconds % 60 + 60) % 60;
        this.minutes = (totalMinutes % 60 + 60) % 60;
        this.hours = (totalHours % 24 + 24) % 24;
    }
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем начальные часы, минуты, секунды
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        // Создаем объект Watch с начальным временем
        Watch watch = new Watch(hours, minutes, seconds);

        // Считываем, насколько изменить время
        int addHours = scanner.nextInt();
        int addMinutes = scanner.nextInt();
        int addSeconds = scanner.nextInt();

        // Обновляем время
        watch.update(addHours, addMinutes, addSeconds);

        // Выводим новое время
        System.out.println(watch);

        scanner.close();
    }
}