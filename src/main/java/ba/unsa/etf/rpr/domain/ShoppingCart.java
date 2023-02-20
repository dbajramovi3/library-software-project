package ba.unsa.etf.rpr.domain;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
/**
 * ShoppingCart class which implements Serializable interface, empty constructor, getters and setters
 * Meaning it follows javabeans specification
 * ShoppingCart class also contains a constuctor with 4 atributes, toString, equals and hashcode method
 * @author dbajramovi3
 */
public class ShoppingCart implements Idable, Serializable {

    private int id;
    private int member_card_id;
    private int book_id;
    private LocalDate buy_date;

    /**
     * Constructor with the following attributes
     * @param id id
     * @param card_id cid
     * @param member_id mid
     * @param buy_date bd
     */
    public ShoppingCart(int id, int card_id, int member_id, LocalDate buy_date) {
        this.id = id;
        this.member_card_id = card_id;
        this.book_id = member_id;
        this.buy_date = buy_date;
    }

    /**
     * Empty constructor
     */
    public ShoppingCart(){ }

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
     * getMember_card_id method
     * @return member_card_id
     * @author dbajramovi3
     */
    public int getMember_card_id() {
        return member_card_id;
    }

    /**
     * setMember_card_id method
     * @param member_card_id  mcid
     * @author dbajramovi3
     */
    public void setMember_card_id(int member_card_id) {
        this.member_card_id = member_card_id;
    }

    /**
     * getBook_id method
     * @return book_id
     * @author dbajramovi3
     */
    public int getBook_id() {
        return book_id;
    }

    /**
     * setBook_id method
     * @param book_id bid
     * @author dbajramovi3
     */
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    /**
     * getBuy_date
     * @return buy_date
     * @author dbajramovi3
     */
    public LocalDate getBuy_date() {
        return buy_date;
    }

    /**
     * setBuy_date method
     * @param buy_date bd
     * @author dbajramovi3
     */
    public void setBuy_date(LocalDate buy_date) {
        this.buy_date = buy_date;
    }

    /**
     * toString method
     * @return ispis
     * @author dbajramovi3
     */
    @Override
    public String toString() {
        return "Shopping_cart{" +
                "id=" + id +
                ", card_id='" + member_card_id + '\'' +
                ", member_id='" + book_id + '\'' +
                ", buy_date=" + buy_date +
                '}';
    }

    /**
     *  equals method
     * @param o o
     * @return comparing
     * @author dbajramovi3
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShoppingCart)) return false;
        ShoppingCart that = (ShoppingCart) o;
        return getId() == that.getId() && Objects.equals(getMember_card_id(), that.getMember_card_id()) && Objects.equals(getBook_id(), that.getBook_id()) && Objects.equals(getBuy_date(), that.getBuy_date());
    }

    /**
     * hashCode method
     * @return int
     * @author dbajramovi3
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMember_card_id(), getBook_id(), getBuy_date());
    }
}
