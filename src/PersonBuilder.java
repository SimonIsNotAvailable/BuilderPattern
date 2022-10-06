public class PersonBuilder {
    private Person newPerson;

    public PersonBuilder() {
        newPerson = new Person();
    }

    public PersonBuilder setName(String name) {
        if (newPerson.getName() == null) {
            newPerson.setName(name);
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        newPerson.setSurname(surname);
        return this;
    }

    public PersonBuilder setAge(int age) {
        newPerson.setAge(age);
        return this;
    }

    public PersonBuilder setAddress(String address) {
        newPerson.setAddress(address);
        return this;
    }

    public Person build() {
        if (newPerson.getName() == null || newPerson.getSurname() == null) {
            throw new IllegalStateException("firstname and lastname fields are mandatory");
        }
        return newPerson;
    }
}


