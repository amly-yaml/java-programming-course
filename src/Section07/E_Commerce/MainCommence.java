package Section07.E_Commerce;

import java.util.Enumeration;
import java.util.Scanner;

public class MainCommence {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductList productList = new ProductList(56.90);

    public static void main(String[] args) {
        boolean quit = false;
        startApp();
        printOption();
        while(!quit){
            System.out.println("Enter your option: ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose){
                case 0:
                    System.out.println("Quit App...");
                    quit = true;
                    break;
                case 1:
                    productList.printAllProducts();
                    break;
                case 2:
                    addNewProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    queryProduct();
                    break;
                case 6:
                    printOption();
                    break;
            }
        }


    }

    private static void addNewProduct(){
        System.out.println("Enter the product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price: ");
        double price = scanner.nextDouble();
        Product product = Product.createNewProduct(name, price);
        if(productList.addProduct(product)){
            System.out.println("New Product added: " + name + " Price: $" + price);
        }
        else {
            System.out.println("Error loaded when new adding.");
        }
    }

    private static void updateProduct(){
        System.out.println("Enter existing product name: ");
        String currectName = scanner.nextLine();
        Product existingProductList = productList.queryProduct(currectName);
        if(existingProductList == null){
            System.out.println( currectName + " record does not have in the database.");
        }
        else{
            System.out.println("Enter that new product name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter that price: ");
            double thatPrice = scanner.nextDouble();
            Product newProductRecord = Product.createNewProduct(newName, thatPrice);
            if(productList.updateProduct(existingProductList, newProductRecord)){
                System.out.println("Successfully updated the record.");
            }
            else {
                System.out.println("Error loaded updating.");
            }
        }
    }

    private static void removeProduct(){
        System.out.println("Enter the product name: ");
        String productName = scanner.nextLine();
        Product existingProductList = productList.queryProduct(productName);
        if(existingProductList == null){
            System.out.println(productName + " record does not have in the database.");
        }
        if(productList.removeProduct(existingProductList)){
            System.out.println(productName + " record successfully deleted.");
        }
    }

    private static void queryProduct(){
        System.out.println("Enter the product name: ");
        String name = scanner.nextLine();
        Product productExistingRecord = productList.queryProduct(name);
        if(productExistingRecord == null){
            System.out.println(name + " record does not have in the database.");
        }
        else {
            System.out.println("Product Name: " + productExistingRecord.getProductName() + "  Price: " +
                    productExistingRecord.getPrice());
        }

    }

    private static void startApp(){
        System.out.println("Welcome to Starting World..");
    }

    private static void printOption(){
        System.out.println("Available Action Below:");
        System.out.println("------------------------");
        System.out.println("0 - to shutdown the application\n" +
                "1 - to print all the products list\n" +
                "2 - to add a new product\n" +
                "3 - to update the existing product\n" +
                "4 - to remove the product\n" +
                "5 - query if an existing product exists\n" +
                "6 - to print a list of available action"
        );
        // System.out.println("Choose your action: ");

    }
}
