package abstractClasses.runner;

public class Runner {
    public static void main(String[] args) {
//        GraphicObject graphicObject = new Cirlce();
//        graphicObject.draw();
//        graphicObject.moveTo(3, 4);
        GraphicObject object;
        object = new Cirlce();
        object.draw();
        object.moveTo(10, 10);
    }
}
