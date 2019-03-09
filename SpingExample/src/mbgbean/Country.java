package mbgbean;

public class Country {
    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", cCountryname='" + cCountryname + '\'' +
                ", cCapital='" + cCapital + '\'' +
                '}';
    }

    private Integer id;

    private String cCountryname;

    private String cCapital;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcCountryname() {
        return cCountryname;
    }

    public void setcCountryname(String cCountryname) {
        this.cCountryname = cCountryname == null ? "" : cCountryname.trim();
    }

    public String getcCapital() {
        return cCapital;
    }

    public void setcCapital(String cCapital) {
        this.cCapital = cCapital == null ? null : cCapital.trim();
    }
}