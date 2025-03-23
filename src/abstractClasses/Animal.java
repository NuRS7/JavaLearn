package abstractClasses;

public abstract class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
    public abstract void sleep(); // У дог и у кат будут свои реализация мы дадим возможность
    // индвидуально создать методы
}

// Интерфейс объект класса что умеет делать например наша собака умеет плавать сдавать звуки
// Абстрактный класс тот чем объект класса является
