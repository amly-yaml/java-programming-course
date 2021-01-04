package Section05.SwitchStatement;

import java.util.Scanner;

public class SwitchChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char switchChar = 'A';

        switch (switchChar){
            case 'A':
                System.out.println("A was found.");
                break;
            case 'B':
                System.out.println("B was found.");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(switchChar + " was found.");
                break;
            default:
                System.out.println("A, B, C, D or E not found.");
                break;
        }
        System.out.print("Enter Month: ");
        String monthName = scanner.nextLine();
        switch (monthName.toLowerCase()){
            case "january":
                System.out.println("January");
                break;
            case "march":
                System.out.println("March");
                break;
            case "april": case "may":
                System.out.println(monthName);
                break;
            default:
                System.out.println("Month not found.");


        }
        scanner.close();
    }
}
