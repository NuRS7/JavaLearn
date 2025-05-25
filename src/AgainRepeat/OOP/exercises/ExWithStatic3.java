package AgainRepeat.OOP.exercises;

public class ExWithStatic3 {
    public static void main(String[] args) {
        Product product = new Product();
        product.showIdProduct();
        Product product2 = new Product();
        product2.showIdProduct();
    }
}

class Product {
    static int nextId = 1;
    int ID;
    Product() {
        ID = nextId;
        nextId++;
    }
    void showIdProduct() {
        System.out.println("Продукт с ID: " + ID);
    }
}
