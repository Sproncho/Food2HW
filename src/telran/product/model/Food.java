package telran.product.model;

public class Food extends Product{
    boolean kosher;
    String expDate;

    public Food(String barCode, String name, double price, boolean kosher, String expDate) {
        super(barCode, name, price);
        this.kosher = kosher;
        this.expDate = expDate;
    }

    public boolean isKosher() {
        return kosher;
    }

    public void setKosher(boolean kosher) {
        this.kosher = kosher;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "Food{" +
                "kosher=" + kosher +
                ", expDate='" + expDate + '\'' +
                ", barCode='" + barCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        if (!super.equals(o)) return false;

        Food food = (Food) o;

        return kosher == food.kosher;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (kosher ? 1 : 0);
        return result;
    }
}
