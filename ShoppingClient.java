import java.util.*;

public class ShoppingClient {
   public static void main (String [] args) {
      ShoppingList list = new ShoppingList ();
      Scanner input = new Scanner (System.in);
      boolean intCheck = false;
      
      while (!intCheck) {
         System.out.print("\nEnter your choice from 1 to 5 (Option 1 displays the menu): ");
         
         if (input.hasNextInt()) {
            option (input.nextInt(), list); //call options method
            intCheck = true;
         } 
         
         intCheck = false;
      }   
   }
   
   public static void option (int option, ShoppingList list) {
      Scanner input = new Scanner (System.in);
      
      //option 1
      if (option == 1) {
         System.out.println ("Option 1: Display menu");
         System.out.println ("Option 2: Add a shopping item");
         System.out.println ("Option 3: Change the quantity of an item in your shopping list");
         System.out.println ("Option 4: Display your shopping list");
         System.out.println ("Option 5: Quit");
         
      //option 2
      } else if (option == 2) {
         boolean intCheck = false;
         boolean doubleCheck = false;
         
         //Get item name
         System.out.print ("Enter item name: ");
         String name = input.next(); 
         
         //Get item qty
         int quantity = 0;
         System.out.print ("Enter quantity of item: ");
         while (!intCheck) {
            if (input.hasNextInt()) {
               quantity = input.nextInt();
               intCheck = true;
         
            } else {
               System.out.print ("\nPlease input a numerical value. Enter item quantity: ");
               input.next();
            }
         }
         
         // Get item price
         double price = 0;
         System.out.print ("Unit price (USD): $");
            while (!doubleCheck) {
               if (input.hasNextDouble()) {
                  price = input.nextDouble();
                  doubleCheck = true;
               } else {
                  System.out.print ("Invalid. Please enter a dollar amount ($0.00): $");
                  input.next();
               }
            }
         
         ShoppingItem item = new ShoppingItem (name, quantity, price);
         boolean result = list.add(item);
         
         if (result == true) {
            System.out.println ("Item successfully added into your shopping list!");
         } else {
            System.out.println ("Item cannot be added. Your shopping list is full.");
         }  
         
      //option 3
      } else if (option == 3) {
         boolean intCheck = false;
         
         System.out.print ("Enter name of item to change quantity: ");
         ShoppingItem result = list.searchByName(input.next());
         
         if (result == null) {
            System.out.print ("Item not found");
            
         } else {
            System.out.print ("Enter new quantity: ");
            
            while (!intCheck) {
               if (input.hasNextInt()) {
                  result.setQuantity(input.nextInt());
                  System.out.print ("Quantity for item has been successfully updated!");
                  intCheck = true;
                  
               } else {
                  System.out.print ("Invalid. Enter new quantity: ");
                  input.next();
               }
            }
         }
         
      //option 4
      } else if (option == 4) {
         System.out.println (list);
         System.out.printf("Total cost: $%.2f\n", list.getTotalCost());
        
      //option 5
      } else if (option == 5) {
         System.out.println ("Have a nice day!"); 
      } 
   }
}