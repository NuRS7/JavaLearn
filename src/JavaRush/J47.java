package JavaRush;

public class J47 {
    private class Person{
        private String firstName;
        private String secondName;
        public Person(String firstName, String secondName){
            this.firstName = firstName;
            this.secondName = secondName;
        }
        protected String getFirstName() {
            return firstName;
        }
        String getSecondName() {
            return secondName;
        }
        public String getFullName(){
            return firstName + " " + secondName;
        }

    }

    public static void main(String[] args) {
    }
}
