package ba.unsa.etf.rpr.domain;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Shopping_cart implements Idable, Serializable {
    private int id;
    private String member_card_id;
    private String book_id;
    private Date buy_date;

    public Shopping_cart(int id, String card_id, String member_id, Date buy_date) {
        this.id = id;
        this.member_card_id = card_id;
        this.book_id = member_id;
        this.buy_date = buy_date;
    }

    public Shopping_cart(){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMember_card_id() {
        return member_card_id;
    }

    public void setMember_card_id(String member_card_id) {
        this.member_card_id = member_card_id;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public Date getBuy_date() {
        return buy_date;
    }

    public void setBuy_date(Date buy_date) {
        this.buy_date = buy_date;
    }

    @Override
    public String toString() {
        return "Shopping_cart{" +
                "id=" + id +
                ", card_id='" + member_card_id + '\'' +
                ", member_id='" + book_id + '\'' +
                ", buy_date=" + buy_date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shopping_cart)) return false;
        Shopping_cart that = (Shopping_cart) o;
        return getId() == that.getId() && Objects.equals(getMember_card_id(), that.getMember_card_id()) && Objects.equals(getBook_id(), that.getBook_id()) && Objects.equals(getBuy_date(), that.getBuy_date());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMember_card_id(), getBook_id(), getBuy_date());
    }
}
