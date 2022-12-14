public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("incorrect value \"name\"");
        }
        if (this.name == null) {
            this.name = name;
        }
    }

    public void setSurname(String surname) {
        if (surname == null) {
            throw new IllegalArgumentException("incorrect value \"Surname\"");
        }
        if (this.surname == null) {
            this.surname = surname;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void happyBirthday() {
        this.age++;
    }

    public boolean hasAge() {
        return getAge() != 0;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("incorrect age is put");
        }
        this.age = age;
    }

    public boolean hasAddress() {
        return address != null;
    }

    @Override
    public String toString() {
        return name + " " +
                surname + ", Возраст: " +
                age + ", Город: " +
                address;
    }

    public PersonBuilder newChildBuilder() {

        return new PersonBuilder()
                .setSurname(this.getSurname())
                .setAddress(this.getAddress())
                .setAge(0);
    }

}
