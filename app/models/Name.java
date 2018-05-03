package models;

import io.ebean.Finder;

/**
 * Will return a string for a person's full name in the order of first, last or last, first.
 *
 * @author Group 4
 */
public class Name extends BaseModel{
    public static String firstName;
    public static String lastName;

    /**user.
     * Creates a person with a specified name.
     * @param firstName
     *          The person's first name
     * @param lastName
     *          The person's last name
     */
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Finder<Integer, Name> find = new Finder<>(Name.class);


    /**
     * Get the person's full name in the order of first, last.
     * @return A String representing the person's first name and last name.
     */
    public static String getFirstLast(User user) {
        return user.firstName + " " + user.lastName;
    }

    /**
     * Get the person's full name in the order of last, first.
     * @return A String representing the person's last name and first name.
     */
    public static String getLastFirst(User user) {
        return user.lastName + ", " + user.firstName;
    }

}
