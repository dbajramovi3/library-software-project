package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class Members {
    private int id;
    private String name;
    private String last_name;
    private String email;

    public Members(int id, String name, String last_name, String email) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Members{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Members)) return false;
        Members members = (Members) o;
        return getId() == members.getId() && Objects.equals(getName(), members.getName()) && Objects.equals(getLast_name(), members.getLast_name()) && Objects.equals(getEmail(), members.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getLast_name(), getEmail());
    }
}
