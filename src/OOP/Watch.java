package OOP;

import java.util.Scanner;

public class Watch {
    private int hours;
    private int minutes;
    private int seconds;

    // Конструктор для инициализации времени
    public Watch(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // Геттеры и сеттеры для часов, минут и секунд
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    // Метод для обновления времени
    public void update(int hours, int minutes, int seconds) {
        // Обновляем секунды
        this.seconds += seconds;
        if (this.seconds >= 60 || this.seconds < 0) {
            int extraMinutes = this.seconds / 60;
            this.seconds %= 60;
            if (this.seconds < 0) {
                this.seconds += 60;
                extraMinutes--;
            }
            this.minutes += extraMinutes;
        }

        // Обновляем минуты
        this.minutes += minutes;
        if (this.minutes >= 60 || this.minutes < 0) {
            int extraHours = this.minutes / 60;
            this.minutes %= 60;
            if (this.minutes < 0) {
                this.minutes += 60;
                extraHours--;
            }
            this.hours += extraHours;
        }

        // Обновляем часы
        this.hours += hours;
        if (this.hours >= 24 || this.hours < 0) {
            this.hours %= 24;
            if (this.hours < 0) {
                this.hours += 24;
            }
        }
    }

    // Метод для ввода времени с клавиатуры
    public void setTimeFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите часы (0-23): ");
        int h = scanner.nextInt();
        System.out.print("Введите минуты (0-59): ");
        int m = scanner.nextInt();
        System.out.print("Введите секунды (0-59): ");
        int s = scanner.nextInt();

        setHours(h);
        setMinutes(m);
        setSeconds(s);
    }

    // Переопределение метода toString для вывода времени в формате hh:mm:ss
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Watch watch = new Watch(0, 0, 0); // Инициализация с нулевым временем

        // Ввод времени пользователем
        watch.setTimeFromUserInput();
        System.out.println("Исходное время: " + watch);

        // Запрос на обновление времени
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество часов для добавления: ");
        int addHours = scanner.nextInt();
        System.out.print("Введите количество минут для добавления: ");
        int addMinutes = scanner.nextInt();
        System.out.print("Введите количество секунд для добавления: ");
        int addSeconds = scanner.nextInt();

        // Обновление времени
        watch.update(addHours, addMinutes, addSeconds);
        System.out.println("Обновленное время: " + watch);
    }
}
