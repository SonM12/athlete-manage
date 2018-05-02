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

    /**
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

    /**
     * Creates a student with a specified name.
     * @param student
     *          The student's full name
     */
    public Name(Student student) {
        this.firstName = student.firstName;
        this.lastName = student.lastName;
    }

    /**
     * Creates an admin with a specified name.
     * @param admin
     *          The admin's full name
     */
    public Name(Admin admin) {
        this.firstName = admin.firstName;
        this.lastName = admin.lastName;
    }

    /**
     * Creates a coach with a specified name.
     * @param coach
     *          The coach's full name
     */
    public Name(Coach coach) {
        this.firstName = coach.firstName;
        this.lastName = coach.lastName;
    }

    /**
     * Get the person's full name in the order of first, last.
     * @return A String representing the person's first name and last name.
     */
    public String getFirstLast() {
        return firstName + " " + lastName;
    }

    /**
     * Get the person's full name in the order of last, first.
     * @return A String representing the person's last name and first name.
     */
    public String getLastFirst() {
        return lastName + ", " + firstName;
    }

    public static Finder<Integer, Name> find = new Finder<>(Name.class);

}
