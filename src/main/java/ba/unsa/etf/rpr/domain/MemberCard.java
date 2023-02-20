package ba.unsa.etf.rpr.domain;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

/**
 * MemberCard class which implements Serializable interface, empty constructor, getters and setters
 * Meaning it follows javabeans specification
 * MemberCard class also contains a constuctor with 3 atributes, toString, equals and hashcode method
 * @author dbajramovi3
 */
public class MemberCard implements Idable, Serializable {


    private int id;
    private int member_id;
    private LocalDate activation_date;

    /**
     * MemberCard constructor
     * @param id id
     * @param member_id mid
     * @param activation_date ad
     * @author dbajramovi3
     */
    public MemberCard(int id, int member_id, LocalDate activation_date) {
        this.id = id;
        this.member_id = member_id;
        this.activation_date = activation_date;
    }

    /**
     * Empty constructor
     * @author dbajramovi3
     */
    public MemberCard(){ }

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
     * getMember_id
     * @return member_id
     * @author dbajramovi3
     */
    public int getMember_id() {
        return member_id;
    }
    /**
     * setMember_id
     * @param member_id mid
     * @author dbajramovi3
     */
    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public LocalDate getActivation_date() {
        return activation_date;
    }
    /**
     * setActivation_date
     * @param activation_date ad
     * @author dbajramovi3
     */
    public void setActivation_date(LocalDate activation_date) {
        this.activation_date = activation_date;
    }

    /**
     * toString method
     * @return ispis
     * @author dbajramovi3
     */
    @Override
    public String toString() {
        return "Member_cards{" +
                "id=" + id +
                ", member_id='" + member_id + '\'' +
                ", activation_date=" + activation_date +
                '}';
    }

    /**
     * equals method
     * @param o o
     * @return comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberCard)) return false;
        MemberCard that = (MemberCard) o;
        return getId() == that.getId() && Objects.equals(getMember_id(), that.getMember_id()) && Objects.equals(getActivation_date(), that.getActivation_date());
    }

    /**
     * hashCode method
     * @return int
     * @author dbajramovi3
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMember_id(), getActivation_date());
    }
}
