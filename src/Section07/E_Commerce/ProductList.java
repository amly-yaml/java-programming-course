package Section07.E_Commerce;

import java.util.ArrayList;

public class ProductList {
    private double price;
    private ArrayList<Product> myProduct;

    public ProductList(double price) {
        this.price = price;
        this.myProduct = new ArrayList<>();
    }

    // add product
    public boolean addProduct(Product product){
        int position = findProduct(product);
        if(position>=0){
            System.out.println(product.getProductName() + " already existed in the list.");
            return false;
        }
        this.myProduct.add(product);
        return true;
    }

    // update product
    public boolean updateProduct(Product oldProduct, Product newProduct){
        int position = findProduct(oldProduct);
        if(position<0){
            System.out.println("That product was not found.");
            return false;
        }
        else if(findProduct(newProduct.getProductName())!=-1){
            System.out.println("Product is already in the record. Update is not successful.");
            return false;
        }
        this.myProduct.set(position, newProduct);
        return true;
    }

    // remove product
    public boolean removeProduct(Product product){
        int position = findProduct(product);
        if(position<0){
            //System.out.println("That product does not have in the record.");
            return false;
        }
        this.myProduct.remove(position);
        return true;
    }

    // query product with Product whole set by entering product name
    public Product queryProduct(String productName){
        int position = findProduct(productName);
        if(position>=0){
            return this.myProduct.get(position);
        }
        return null;

    }

    // print all the products
    public void printAllProducts(){
        System.out.println("Product List");
        for(int i=0; i<this.myProduct.size(); i++){
            System.out.println( i+1 + ". Product Name: " + this.myProduct.get(i).getProductName() + "\n\t" + "Price: $"  +
                    this.myProduct.get(i).getPrice());
        }
    }

    // find product with index of product
    private int findProduct(Product product){
       return this.myProduct.indexOf(product);
    }

    // find product with name
    private int findProduct(String productName){
        for (int i=0; i<this.myProduct.size(); i++){
            Product product = this.myProduct.get(i);
            if(product.getProductName().equals(productName)){
                return i;
            }
        }
        return -1;
    }
}

