public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;
    public Person() {
    }

    public Person (String name, String surname, int age ) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name) {
        if(this.name == null) {
            this.name = name;
        }
    }

    public void setSurname(String surname) {
        if(this.surname == null) {
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
    public void happyBirthday(){
        this.age++;
    }
    public boolean hasAge() {
        if(getAge() != 0 ) {
            return true;
        } else
            return false;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            throw new IllegalArgumentException("incorrect age is put");
        }
        this.age = age;
    }

    public boolean hasAddress() {
        if(address == null) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return name + " " +
                surname + ", Возраст: " +
                age + ", Город: " +
                address;
    }
    public PersonBuilder newChildBuilder() {

        PersonBuilder son = new PersonBuilder()
                .setSurname(this.getSurname())
                .setAddress(this.getAddress())
                .setAge(0);
        return son;
    }

}
