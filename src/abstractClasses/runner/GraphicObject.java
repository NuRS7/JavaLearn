package abstractClasses.runner;

import java.awt.*;

public abstract class GraphicObject {
    public abstract void draw();

    public int moveTo(int x, int y) {
        int z = y + x;
        System.out.println(z);
        return z;
    }

}
