package AgainRepeat.OOP.exercises;

public class ExWithEncapsulation4 {
    public static void main(String[] args) {
        Adam adam = new Adam("Nurs", 21, "87777757675", "Astana", Adam.Gender.MALE);
        adam.display();
        adam.changeName("Nursultan");
        adam.display();
        Adam adam1 = new Adam("Medet", 17, "87772777272", "Almaty", Adam.Gender.MALE);
        adam1.display();
        Adam adam2 = new Adam("Emre", 20, "87773333232", "Turkestan", Adam.Gender.MALE);
        adam2.updatePhoneAndAddress("87772227272", "Turkey");
        adam2.changeGender(Adam.Gender.FEMALE);
        adam2.display();

    }
}

class Adam {
    String name;
    protected int age;
    private String phone;
    private String address;
    static int counter = 0;
    private Gender gender;

    Adam(String username, int userAge, String userPhone, String userAddress, Gender gender) {
        setName(username);
        setAge(userAge);
        setPhone(userPhone);
        setAddress(userAddress);
        setGender(gender);
        counter++;
    }
    enum Gender {
        MALE, FEMALE
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public Gender getGender() {
        return gender;
    }

    public void changeGender(Gender gender) {
        switch (gender) {
            case MALE -> setGender(Gender.MALE);
            case FEMALE -> setGender(Gender.FEMALE);
        };
    }
    public int getTotalPeople() {
        return counter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (0 > age) {
            throw new IllegalArgumentException("Age must be greater than or equal to 0");
        }
        else this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.isEmpty() || address == null) {
            throw new IllegalArgumentException("Address cannot be empty");
        }
        else this.address = address;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        else this.name = name;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        if (phone.isEmpty() || phone == null) {
          throw new IllegalArgumentException("Phone cannot be empty");
        } else if (phone.matches("\\d{12}")) {
            throw new IllegalArgumentException("Phone length must be 11");
        } else {
            this.phone = phone;
        }

    }

    public void display() {
        System.out.println("Name: " + getName() +
                ", Age: " + getAge() +
                ", Address: " + getAddress() +
                ", Phone: " + getPhone() +
                ", isAdult: " + isAdult() +
                ", totalPeople: " + getTotalPeople() +
                ", gender: " + getGender()
        );

    }

    void changeName(String newName) {
         setName(newName);
    }
    private void changeAge(int newAge) {
        setAge(newAge);
    }
    protected void changeAddress(String newAddress) {
        setAddress(newAddress);
    }
    public void changePhone(String newPhone) {
        if (newPhone.isEmpty() || newPhone == null) {
            throw new IllegalArgumentException("Phone cannot be empty");
        } else if (newPhone.length() != 11) {
            throw new IllegalArgumentException("Phone length must be 11");
        }
        else this.phone = newPhone;
    }

    void updatePhoneAndAddress(String newPhone, String newAddress) {
        setAddress(newAddress);
        setPhone(newPhone);
    }

    protected void celebrateBirthday() {
        this.age++;
        System.out.println("Happy Birthday" + "! " + this.name);
    }
}
