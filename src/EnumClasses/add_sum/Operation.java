package EnumClasses.add_sum;

public enum Operation implements Action{
    SUM {
        @Override
        public int action(int x, int y) {
            return x + y;
        }
    },
    SUBSTRACT{
        @Override
        public int action(int x, int y) {
            return x - y;
        }

    },
    MULTIPLY {
        @Override
        public int action(int x, int y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public int action(int x, int y) {
            return x / y;
        }
    };

    public abstract int action(int x, int y);
}
