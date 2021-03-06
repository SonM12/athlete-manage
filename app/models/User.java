package models;

import io.ebean.Finder;

/**
 * Will return a string for a person's full name in the order of first, last or last, first.
 *
 * @author Group 4
 */
public class User extends BaseModel{
    public static String firstName;
    public static String lastName;
    public String email;

    /**
     * Creates a person with a specified name.
     * @param firstName
     *          The person's first name
     * @param lastName
     *          The person's last name
     * @param email
     *          The person's email
     */
    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static Finder<Integer, User> find = new Finder<>(User.class);


    /**
     * Get the person's full name in the order of first, last.
     * @return A String representing the person's first name and last name.
     */
    public static String getFirstLast() {
        return firstName + " " + lastName;
    }

    /**
     * Get the person's full name in the order of last, first.
     * @return A String representing the person's last name and first name.
     */
    public static String getLastFirst() {
        return lastName + ", " + firstName;
    }

}
