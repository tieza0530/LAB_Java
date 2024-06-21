package Manager;

/*
 * @author thaib
 */
public class Country  implements Comparable<Country>{
    private String countryCode;
    private String countryName;
    private double countryArea;

    public Country() {
    }

    public Country(String countryCode, String countryName, double countryArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryArea = countryArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(double countryArea) {
        this.countryArea = countryArea;
    }

    public void display() {
        System.out.printf("%-10s%-25s%-20.1f", this.countryCode,
                this.countryName, this.countryArea);
    }
    
    public int compareTo(Country t) {
        return this.getCountryName().compareTo(t.getCountryName());
    }   
}


