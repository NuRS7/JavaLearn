package AgainRepeat.OOP;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Animal(1));
        animalsList.add(new Animal(2));
    }
    private static void test(List<Animal> animalsList) {
        for (Animal animal : animalsList) {
            System.out.println(animal);
        }
    }
}
