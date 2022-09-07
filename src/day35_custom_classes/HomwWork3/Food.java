package day35_custom_classes.HomwWork3;

public class Food {

    String name;
    int quantity;
    Double unitPrice;
    Double totalPrice;


    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public Food(String name, int quantity, Double Price) {

        this.name = name;
        this.quantity = quantity;
        this.unitPrice = Price;
        calculatePrice();

    }

    private void calculatePrice() {
        totalPrice = unitPrice * quantity;


    }
}
