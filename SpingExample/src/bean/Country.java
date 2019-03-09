package bean;

public class Country {
    int id;
    String c_countryname;
    String c_capital;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getC_countryname() {
        return c_countryname;
    }

    public void setC_countryname(String c_countryname) {
        this.c_countryname = c_countryname;
    }

    public String getC_capital() {
        return c_capital;
    }

    public void setC_capital(String c_capital) {
        this.c_capital = c_capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", c_countryname='" + c_countryname + '\'' +
                ", c_capital='" + c_capital + '\'' +
                '}';
    }
}
