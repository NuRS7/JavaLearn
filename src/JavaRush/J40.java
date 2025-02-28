package JavaRush;

public class J40 {
    public static void write(String str, int count) { // Передаем параметры String и int
        for (int i = 0; i < count; i++) { // int параметр передаем чтобы использовать его в дальнейшим
            System.out.println(str);

        }
    }
    public static void main(String[] args) {
        write("Hello", 12); //Здесь даем значения которые переданы в method write(String str, int count)
        String str = "hI"; // можно отдельно переписать значения
        int count = 2;      // и передать в метод для раннинга
        write(str, count);
    }
}
