package Section07.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainGroceryList {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false ;
        // GroceryList groceryList = new GroceryList();
        printInstruction();
        while (!quit){
            System.out.println("Enter you choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    updateItemName();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    searchItem();
                    break;
                case 5:
                    groceryList.printGroceryList();
                    break;
                case 6:
                    getAllGroceryList();
                    break;
                case 7:
                    quit = true;
                    break;
            }

        }

    }
    public static void printInstruction(){
        System.out.println("Press the following number: ");
        System.out.println("\t 0: To print choice option.");
        System.out.println("\t 1: To add the item in grocery list.");
        System.out.println("\t 2: To modify the item in the list.");
        System.out.println("\t 3: To remove the item in grocery list.");
        System.out.println("\t 4: To search the item in the list.");
        System.out.println("\t 5: To print all the items in the list.");
        System.out.println("\t 6: To quit the application.");
    }

    public static void addItem(){
        System.out.print("Enter the grocery item: ");
        String addName = scanner.nextLine();
        groceryList.addGroceryItem(addName);

    }

    public static void updateItemName(){
        //System.out.print("Enter the item number: ");
        // int itemNumber = scanner.nextInt();
        System.out.print("Enter the current item name: ");
        String currentName = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Change that item name: ");
        String updateName = scanner.nextLine();
        //groceryList.modifyItem(itemNumber-1, updateName);
        groceryList.modifyGroceryItem(currentName, updateName);

    }

    public static void removeItem(){
//        System.out.print("Enter the remove item number: ");
//        int itemNumber = scanner.nextInt();
        System.out.print("Enter the remove item name: ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchItem(){
        System.out.print("Enter search item name: ");
        String itemName = scanner.nextLine();
        // if (groceryList.findItem(itemName) != null){
        if(groceryList.onFile(itemName)){
            System.out.println(itemName + " found in the grocery list.");
        }else {
            System.out.println(itemName + " is not in the grocery list.");
        }
    }

    // to copy the whole array list to avoid doing the process of looping each by each
    public static void getAllGroceryList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        // another way to copy the array list
        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        // another way to copy the array list
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

    }





}
