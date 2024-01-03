package Pradeep;

class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public void calcTax() {
        double taxAmount = (price * quantity) * salesTax;
        System.out.println("Sales Tax for product " + pid + ": " + taxAmount);
    }

}
