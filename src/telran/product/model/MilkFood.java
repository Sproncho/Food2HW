package telran.product.model;

public class MilkFood extends Food{
    String typeOfMilk;
    double fatness;

    public MilkFood(String barCode, String name, double price, boolean kosher, String expDate, String typeOfMilk, double fatness) {
        super(barCode, name, price, kosher, expDate);
        this.typeOfMilk = typeOfMilk;
        this.fatness = fatness;
    }

    public String getTypeOfMilk() {
        return typeOfMilk;
    }

    public void setTypeOfMilk(String typeOfMilk) {
        this.typeOfMilk = typeOfMilk;
    }

    public double getFatness() {
        return fatness;
    }

    public void setFatness(int fatness) {
        this.fatness = fatness;
    }

    @Override
    public String toString() {
        return "MilkFood{" +
                "typeOfMilk='" + typeOfMilk + '\'' +
                ", fatness=" + fatness +
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
        if (!(o instanceof MilkFood)) return false;
        if (!super.equals(o)) return false;

        MilkFood milkFood = (MilkFood) o;

        if (Double.compare(milkFood.fatness, fatness) != 0) return false;
        return typeOfMilk.equals(milkFood.typeOfMilk);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + typeOfMilk.hashCode();
        temp = Double.doubleToLongBits(fatness);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
