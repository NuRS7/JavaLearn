package JavaLearnNModel;

public class ClassField {
    private String carname;


    void doSomething() {
        this.carname = "Mercedes";
    }

    public void setCarname(String newname) {
        this.carname = newname;

    }
    public void getCarName() {
        System.out.println(this.carname);

    }
}
