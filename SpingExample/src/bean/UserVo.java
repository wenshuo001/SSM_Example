package bean;

public class UserVo extends User{

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    private Country country;

    @Override
    public String toString() {
        return "UserVo{" +
                "country=" + country +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", c_id=" + c_id +
                '}';
    }
}
