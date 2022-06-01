package telran.product.model;

public class MeatFood extends Food{
    String typeOfMeat;

    public MeatFood(String barCode, String name, double price, boolean kosher, String expDate, String typeOfMeat) {
        super(barCode, name, price, kosher, expDate);
        this.typeOfMeat = typeOfMeat;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

    @Override
    public String toString() {
        return "MeatFood{" +
                "typeOfMeat='" + typeOfMeat + '\'' +
                ", kosher=" + kosher +
                ", expDate='" + expDate + '\'' +
                ", barCode='" + barCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MeatFood)) return false;
        if (!super.equals(o)) return false;

        MeatFood meatFood = (MeatFood) o;

        return typeOfMeat.equals(meatFood.typeOfMeat);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + typeOfMeat.hashCode();
        return result;
    }
}
