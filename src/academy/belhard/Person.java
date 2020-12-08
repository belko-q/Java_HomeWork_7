package academy.belhard;

import java.util.Objects;

public class Person {
    private final String firstname;
    private final String lastname;
    private final Gender gender;

    public Person(String firstname, String lastname, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return firstname.equals(person.firstname) &&
                lastname.equals(person.lastname) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return (2 * firstname.hashCode() + 3 * lastname.hashCode() + 5 * gender.hashCode());
    }

    @Override
    public String toString() {
        return
                "firstname: " + firstname +
                ", lastname: " + lastname +
                ", gender: " + gender;
    }
}
