package OOP;

public class DecrementingCarousel {
    private final int capacity;
    private final int[] elements;
    private int size;
    private boolean isRunning;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.size = 0;
        this.isRunning = false;
    }

    public boolean addElement(int element) {
        if (isRunning || size >= capacity || element <= 0) {
            return false;
        }
        elements[size++] = element;
        return true;
    }

    public CarouselRun run() {
        if (isRunning) {
            return null;
        }
        isRunning = true;
        return new CarouselRun(elements.clone());
    }
}