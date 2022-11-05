public class Apartment {
    private String title;
    private long price;
    private String address;


    void setTitle(String title) {
        this.title = title;
    }

    void setPrice(long price) {
        this.price = price;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getTitle() {
        return title;
    }

    long getPrice() {
        return price;
    }

    String getAddress() {
        return address;
    }

    double payPerMonth(double sum) {
        double l = getPrice() / sum;
        return l;
    }
}
