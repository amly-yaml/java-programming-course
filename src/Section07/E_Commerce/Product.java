package Section07.E_Commerce;

public class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // build static to create new product without creating instance
    public static Product createNewProduct(String productName, double price){
        return new Product(productName, price);
    }
}
