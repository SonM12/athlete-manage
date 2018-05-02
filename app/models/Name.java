package models;

import io.ebean.Finder;

/**
 * Will return a string for a person's full name in the order of first, last or last, first.
 *
 * @author Group 4
 */
public class Name extends BaseModel{
    public String firstName;
    public String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name(Student student) {
        this.firstName = student.firstName;
        this.lastName = student.lastName;
    }

    public Name(Admin admin) {
        this.firstName = admin.firstName;
        this.lastName = admin.lastName;
    }

    public Name(Coach coach) {
        this.firstName = coach.firstName;
        this.lastName = coach.lastName;
    }
    public String getFirstLast() {
        return firstName + " " + lastName;
    }

    public String getLastFirst() {
        return lastName + ", " + firstName;
    }

    public static Finder<Integer, Name> find = new Finder<>(Name.class);

}
