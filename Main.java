/*
tasks for Toi Eik:
1. Make a functional menu (do as many functions as you can) 
print menu
if choice = 1: add contact() (Contact.getInfo)
if choice = 2: look up contact()
...
if choice = 5: print all() - Contact.printInfo
2. 

*/

import AddressBook.*;
import java.util.Scanner;

public class Main{
    private static Scanner scan = new Scanner(System.in);

    public static void mainMenu(){
        System.out.println("----------------------");
        System.out.println("1.Add a new contact. ");
        System.out.println("2.Look up the contact based on name");
        System.out.println("3.Delete a contact(after look up). ");//first will execute look up
        System.out.println("4.Modify a contact(after look up). ");
        System.out.println("5.Print all contacts ");
        System.out.println("6.Exit ");

    }

    public static void main(String[] args) {
        int contactCount = 0;
        loop1: while (true){
          mainMenu();
          String choice = IOUtils.getString("What do you want to do?: ");
          switch (choice){
            case "1": //adding new contact
              System.out.println("here we will have code for adding contacts");
              Contact.getValidateBirthday();
              
              contactCount++;
              continue loop1;
            case "6":
              break loop1;
            default:
              System.out.println("Invalid input, please try again");
              continue loop1;
          }
        }
        
    }
}

     