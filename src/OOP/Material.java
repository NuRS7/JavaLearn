package OOP;

import java.util.Locale;
import java.util.Scanner;

class Material {
    private final String name;
    private final double density;

    public Material(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return String.format("%s;%.1f", name, density);
    }
}

class Subject {
    private String name;
    private Material material;
    private double volume;

    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) { // Исправлен тип на double
        this.volume = volume;
    }

    public double getMass() {
        return material.getDensity() * volume;
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%.2f;%.1f", name, material, volume, getMass());
    }
}

class Solution {
    public static void main(String[] args) {
        // Locale.setDefault(Locale.ENGLISH); // Можно убрать, так как не влияет
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.hasNext() ? sc.next() : null;
            double density = sc.nextDouble();
            String subjectName = sc.hasNext() ? sc.next() : null;
            double volume = sc.nextDouble();
            sc.close();

            Material material = new Material(name, density);
            Subject subject = new Subject(subjectName, material, volume);

            System.out.println(subject); // Добавлен println вместо print

            Material copper = new Material("copper", 8500.0);
            subject.setMaterial(copper); // Исправлено: обновляем материал

            System.out.printf(" %.2f%n", subject.getMass()); // Добавлен пробел перед числом
        }

    }
}
