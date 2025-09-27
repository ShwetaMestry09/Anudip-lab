/*
 *  A phone directory holds a list of names with a phone number for each name. 
 *  It is possible to find the number associated with a given name, and to specify the phone number for a given name. 

 [Hint:use a HashMap to store names as keys and phone numbers as values. The user can choose to find a number by providing a name or add a new 
 name with a phone number. The program runs in a loop until the user chooses to exit.] 
 */


package anu_programs;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        // HashMap to store name and phone number
        HashMap<String, String> phoneBook = new HashMap<>();

        // Add some sample contacts
        phoneBook.put("Shweta", "9876543210");
        phoneBook.put("Pranali", "9123456780");
        phoneBook.put("Vedant", "9988776655");

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Phone Directory ---");
            System.out.println("1. Add new contact");
            System.out.println("2. Find phone number by name");
            System.out.println("3. Show all contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String number = sc.nextLine();
                    phoneBook.put(name, number);
                    System.out.println("Contact saved successfully!");
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    String foundNumber = phoneBook.get(searchName);
                    if (foundNumber != null) {
                        System.out.println("Phone number for " + searchName + " is: " + foundNumber);
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- All Contacts ---");
                    for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                    break;

                case 4:
                    System.out.println("Exiting Phone Directory. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
/* Output: 
 * 
--- Phone Directory ---
1. Add new contact
2. Find phone number by name
3. Show all contacts
4. Exit
Enter your choice: 3

--- All Contacts ---
Shweta : 9876543210
Pranali : 9123456780
Vedant : 9988776655

--- Phone Directory ---
1. Add new contact
2. Find phone number by name
3. Show all contacts
4. Exit
Enter your choice: 2
Enter name to search: Shweta
Phone number for Shweta is: 9876543210

--- Phone Directory ---
1. Add new contact
2. Find phone number by name
3. Show all contacts
4. Exit
Enter your choice: 1
Enter name: Ayushi
Enter phone number: 9876543214
Contact saved successfully!

--- Phone Directory ---
1. Add new contact
2. Find phone number by name
3. Show all contacts
4. Exit
Enter your choice: 3

--- All Contacts ---
Shweta : 9876543210
Pranali : 9123456780
Vedant : 9988776655
Ayushi : 9876543214

--- Phone Directory ---
1. Add new contact
2. Find phone number by name
3. Show all contacts
4. Exit
Enter your choice: 4
Exiting Phone Directory. Goodbye!
*/
 