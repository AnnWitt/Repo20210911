package z20210918.z20210918Obiektowe.pkg.z20210918ObiektoweZadanie3k1;

public class OrderItem {
    private String productName;
    private int quantity;
    private double price;

    public OrderItem(String productName, double price,int quantity) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getAmount() {
        return quantity*price;
    }

    public boolean isCorrect() {
        return (price>0 && quantity>0);
    }

    public void print() {

            System.out.println(productName +" | "+ price + " zł | " +
                    quantity + " pcs | " +getAmount() + " |");

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
