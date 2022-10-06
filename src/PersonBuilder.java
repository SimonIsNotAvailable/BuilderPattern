public class PersonBuilder{
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
    }

    public void setName(String name) {
        if(this.name == null) {
            this.name = name;
        }
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
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
    public Person build() {
        return new Person (name, surname, age);
    }
}


