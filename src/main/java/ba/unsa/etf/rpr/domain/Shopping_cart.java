package ba.unsa.etf.rpr.domain;
import java.util.Date;
import java.util.Objects;

public class Shopping_cart {
    private int id;
    private String card_id;
    private String member_id;
    private Date buy_date;

    public Shopping_cart(int id, String card_id, String member_id, Date buy_date) {
        this.id = id;
        this.card_id = card_id;
        this.member_id = member_id;
        this.buy_date = buy_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
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
                ", card_id='" + card_id + '\'' +
                ", member_id='" + member_id + '\'' +
                ", buy_date=" + buy_date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shopping_cart)) return false;
        Shopping_cart that = (Shopping_cart) o;
        return getId() == that.getId() && Objects.equals(getCard_id(), that.getCard_id()) && Objects.equals(getMember_id(), that.getMember_id()) && Objects.equals(getBuy_date(), that.getBuy_date());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCard_id(), getMember_id(), getBuy_date());
    }
}
