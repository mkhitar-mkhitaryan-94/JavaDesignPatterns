package prototype;

public class AddressCopy {
    public String streetAddress, city, country;

    public AddressCopy(String streetAddress, String city, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
    }

    public AddressCopy(AddressCopy other) {
        this(other.streetAddress, other.city, other.country);
    }

    @Override
    public String toString() {
        return "AddressCopy{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
