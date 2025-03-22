package interfaces.base;

interface Interface1 {
    int someField = 100;
    String someMethod();
}


interface Interface2 {
    double someField = 200.5;
    String someMethod();
}
interface Interface3 extends Interface1, Interface2 {

}
class SomeClass implements Interface1, Interface2 {
    @Override
    public String someMethod() {
        System.out.println("Interface2 " + Interface2.someField);
        return "It works";
    }
}

public class Demo3 {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        System.out.println(someClass.someMethod());
        System.out.println(((Interface2) someClass).someMethod());
        System.out.println(((Interface1)someClass).someField);
        System.out.println(Interface1.someField);
    }
}
