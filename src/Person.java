public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;

    public Person (PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
    }
    public Person () {
    }
    public Person (String name, String surname, int age ) {
        this.name = name;
        this.surname= surname;
        this.age = age;
    }

    public void setName(String name) {
        if(this.name == null) {
            this.name = name;
        }
    }

//    public void setSurname(String surname) {
//        if(this.surname == null) {
//            this.surname = surname;
//        }
//    }

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
    public boolean hasAddress() {
        if(address == null) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        String personInfo =
                name + " " +
                        surname + " " +
                        age + " " + address;
        return personInfo;
    }
    public PersonBuilder newChildBuilder() {
        return null;
    }

}
