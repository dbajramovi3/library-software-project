package ba.unsa.etf.rpr.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * Member class which implements Serializable interface, empty constructor, getters and setters
 * Meaning it follows javabeans specification
 * Member class also contains a constuctor with 4 atributes, toString, equals and hashcode method
 * @author dbajramovi3
 */
public class Member implements Idable, Serializable {


    private int id;
    private String name;
    private String last_name;
    private String email;

    /**
     * Member constructor
     * @param id id
     * @param name name
     * @param last_name lastname
     * @param email email
     */
    public Member(int id, String name, String last_name, String email) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
    }

    /**
     * Empty constructor
     * @author dbajramovi3
     */
    public Member(){ }

    /**
     * getId method
     * @return id
     * @author dbajramovi3
     */
    public int getId() {
        return id;
    }

    /**
     * setId method
     * @param id id
     * @author dbajramovi3
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getName method
     * @return name
     * @author dbajramovi3
     */
    public String getName() {
        return name;
    }

    /**
     * setName method
     * @param name name
     * @author dbajramovi3
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getLast_name method
     * @return last name
     * @author dbajramovi3
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * setLast_name method
     * @param last_name ln
     * @author dbajramovi3
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * getEmail method
     * @return email
     * @author dbajramovi3
     */
    public String getEmail() {
        return email;
    }

    /**
     * setEmail method
     * @param email em
     * @author dbajramovi3
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * toString method
     * @return ispis
     * @author dbajramovi3
     */
    @Override
    public String toString() {
        return "  " + id + "   "
                + name + "  " + last_name + "   " + email;
    }

    /**
     * equals method
     * @param o o
     * @return comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member members = (Member) o;
        return getId() == members.getId() && Objects.equals(getName(), members.getName()) && Objects.equals(getLast_name(), members.getLast_name()) && Objects.equals(getEmail(), members.getEmail());
    }

    /**
     * hashCode method
     * @return int
     * @author dbajramovi3
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getLast_name(), getEmail());
    }
}
