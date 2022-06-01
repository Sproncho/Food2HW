package telran.product.model;
public class Product {
    String barCode;
    String name;
     double price;

    public Product(String barCode, String name, double price) {
        this.barCode = barCode;
        this.name = name;
        this.price = price;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "barCode='" + barCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
