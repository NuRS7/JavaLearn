package OOP;

public class CarouselRun {
    private final int[] elements;
    private int currentIndex;

    public CarouselRun(int[] elements) {
        this.elements = elements;
        this.currentIndex = 0;
    }

    public int next() {
        if (isFinished()) {
            return -1;
        }

        while (elements[currentIndex] == 0) {
            currentIndex = (currentIndex + 1) % elements.length;
        }

        int value = elements[currentIndex];
        elements[currentIndex]--; // Уменьшаем текущее значение на 1

        // Переход к следующему ненулевому элементу
        currentIndex = (currentIndex + 1) % elements.length;

        return value;
    }


    public boolean isFinished() {
        for (int element : elements) {
            if (element > 0) {
                return false;
            }
        }
        return true;
    }
}

