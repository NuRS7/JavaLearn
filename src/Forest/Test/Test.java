package Forest.Test;

import Forest.Squirell;
import Forest.Tree;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree("Nurs", 5);
        tree.showInfo();

        Squirell squirell = new Squirell("MM", 4);
        squirell.showInfo();
    }
}
