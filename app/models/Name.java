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

    public String getFirstLast() {
        return firstName + " " + lastName;
    }

    public String getLastFirst() {
        return lastName + ", " + firstName;
    }

    public static Finder<Integer, Name> find = new Finder<>(Name.class);


}
