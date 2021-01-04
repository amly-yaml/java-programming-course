package Section07.ArrayList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();  // can add parameter

    // Add Item
    public void addGroceryItem(String addItem){
        groceryList.add(addItem);
    }

    // change/upload the code to not enter the item no for modify
    public void modifyGroceryItem(String currentItem , String newItem){
        int position = findItem(currentItem);
        if(position>=0){
            modifyItem(position, newItem);
        }
    }

    // Modify item
    private void modifyItem(int position, String itemName){
        groceryList.set(position, itemName);
        System.out.println("Grocery item " + (position+1 + " has been modified."));
    }

    // change/upload the code to not enter the item no for remove
    public void removeGroceryItem(String itemName){
        int position = findItem(itemName);
        if(position>=0){
            removeItem(position);
            System.out.println(itemName + " successfully removed in the grocery list.");
        }
    }

    // Remove the item
    private void removeItem(int position){
        groceryList.remove(position);
    }

    // Search Item in int
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
//        int position = groceryList.indexOf(searchItem);
//        if (position>=0){
//            return groceryList.get(position);
//        }
//        return null;
    }

    // Find Item in the List
    public boolean onFile(String searchName){
        int position = findItem(searchName);
        if(position>=0){
            return true;
        }
        return false;
    }

    // print grocery list
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }




}
