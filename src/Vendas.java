public class Vendas {
    private String product;
    private int codeProduct;
    private double price;
    private int amount;

    public Vendas(String product, int codeProduct, double price, int amount) {
        this.product = product;
        this.codeProduct = codeProduct;
        this.price = price;
        this.amount = amount;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "\nVendas{ " +
                "product='" + product + '\'' +
                ", codeProduct=" + codeProduct +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
