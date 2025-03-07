package Basics;

public class InheritanceHierarchy {
    public static void main(String[] args) {
        Person tom = new Person("Tom");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
        Person bob = new Client("Nurs", "KaspiBank", 99999999);
        bob.display();

    }
}
    class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }


        public String getName() {
            return name;
        }

        public void display() {

            System.out.printf("Person %s \n", name);
        }
    }
        class Employee extends Person {
            private String company;


            public Employee(String name, String company) {
                super(name);
                this.company = company;

            }

            public String getCompany() {
                return company;
            }

            public void display() {
                System.out.println("Name: " + super.getName() + " Company: " + company);
            }
        }

        class Client extends Person {
            private int sum;
            private String bank;
            public Client(String name,String bank, int sum) {
                super(name);
                this.bank = bank;
                this.sum = sum;
            }

            public void display() {
                System.out.println("Name: " + super.getName()+ " Sum: " + sum+ " Bank: " + bank);
            }

            public int getSum() {
                return sum;
            }

            public String getBank() {
                return bank;
            }
        }


