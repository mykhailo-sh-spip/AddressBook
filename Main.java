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
        System.out.println("1.Add a new contact. ");
        System.out.println("2.Look up the contact based on name");
        System.out.println("3.Delete a contact(after look up). ");//first will execute 
        System.out.println("4.Modify a contact(after look up). ");
        System.out.println("5.Print all contacts ");
        System.out.println("6.Exit ");

    }

    public static void main(String[] args) {
        String date = BirthdayValidation.getDate();
        //mainMenu();
        String choice = scan.nextLine();
        //if choice =="1": run function for adding contacts
    }
}

    