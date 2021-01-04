package Section07.LinkList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

//        stringLinkedList.add("Sydney");
//        stringLinkedList.add("Melbourne");
//        stringLinkedList.add("Brisbane");
//        stringLinkedList.add("Perth");
//        stringLinkedList.add("Canberra");
//        stringLinkedList.add("Adelaide");
//        stringLinkedList.add("Darwin");
//        printLinkList(stringLinkedList);

        alphabetAddInOrder(placesToVisit, "Sydney");
        alphabetAddInOrder(placesToVisit, "Melbourne");
        alphabetAddInOrder(placesToVisit, "Brisbane");
        alphabetAddInOrder(placesToVisit,"Perth");
        alphabetAddInOrder(placesToVisit, "Canberra");
        alphabetAddInOrder(placesToVisit, "Adelaide");
        alphabetAddInOrder(placesToVisit, "Darwin");
        alphabetAddInOrder(placesToVisit, "Alice Springs");

        // alphabetInOrder(stringLinkedList, "Darwin");

        // System.out.println(placesToVisit.indexOf("Sydney"));

        // stringLinkedList.add(1, "Alice Springs");
        printLinkList(placesToVisit);

        System.out.println("------------------");
        alphabetAddInOrder(placesToVisit, "Melbourne" );

        visit(placesToVisit);

    }
    private static void printLinkList(LinkedList<String> linkedList){
        Iterator<String> iterator = linkedList.iterator();
        // this is another method for looping using while can also use for
        while (iterator.hasNext()){
            System.out.println(" Now visiting " + iterator.next());
        }
        System.out.println("_________________________");
    }

    // this is make easy for finding the index position
    // to insert or change position and adding the visit places for in order
    private static boolean alphabetAddInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()){
            int compare = listIterator.next().compareTo(newCity);
            // System.out.println(compare);
            if(compare == 0){
                // equal, do not add
                System.out.println(newCity + " is already existed.");
                return false;
            }
            else if(compare>0){
                // new City should appear before this one
                // Brisbane  -> Adelaide
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            }
        }
        listIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        // this get for the 1st place of city is has or not
        if(cities.isEmpty()){
            System.out.println("No city in the iterator.");
        }
        else {
            // this get the first index of list iterator
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit){
            System.out.println("");
            System.out.print("Enter for place to visit: ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose){
                case 0:
                    System.out.println("It is over for the summer holiday.");
                    quit = true;
                    break;
                case 1:
                    // listIterator does not have current position
                    // so it set false it set the first place of index in the list
                    // and the users has previously selected going back
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Next city visiting " + listIterator.next());
                    }else {
                        System.out.println("It reach end of the distination.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    // and the users has previously selected going forward
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Previous city to visit " + listIterator.previous());
                    }
                    else {
                        System.out.println("It reach start of the place.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                default:
                    System.out.println("Make sure you enter valid number.");
            }

        }

    }


    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }


}
