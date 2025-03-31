package GenericsClasses;

public class Test<U,S> {
    private U obj;
    private S object;
    public Test(U obj, S object) {
        this.obj = obj;
        this.object = object;
    }
    public U getObj() {
        return obj;
    }
    public void setObj(U obj) {
        this.obj = obj;
    }
    public S getObject() {
        return object;
    }

    public void setObject(S object) {
        this.object = object;
    }
}

class Demo {
    public static void main(String[] args) {

    }
}
