package ba.unsa.etf.rpr.domain;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class MemberCard implements Idable, Serializable {
    private int id;
    private int member_id;
    private Date activation_date;
    private Date expiration_date;

    public MemberCard(int id, int member_id, Date activation_date, Date expiration_date) {
        this.id = id;
        this.member_id = member_id;
        this.activation_date = activation_date;
        this.expiration_date = expiration_date;
    }
    public MemberCard(){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public Date getActivation_date() {
        return activation_date;
    }

    public void setActivation_date(Date activation_date) {
        this.activation_date = activation_date;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    @Override
    public String toString() {
        return "Member_cards{" +
                "id=" + id +
                ", member_id='" + member_id + '\'' +
                ", activation_date=" + activation_date +
                ", expiration_date=" + expiration_date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberCard)) return false;
        MemberCard that = (MemberCard) o;
        return getId() == that.getId() && Objects.equals(getMember_id(), that.getMember_id()) && Objects.equals(getActivation_date(), that.getActivation_date()) && Objects.equals(getExpiration_date(), that.getExpiration_date());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMember_id(), getActivation_date(), getExpiration_date());
    }
}