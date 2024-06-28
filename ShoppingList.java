/**
* Each ShoppingList object models a shopping list of items.
* 
* @author Anita Tan
* @version 1.1 (April 11 2022)
*/

public class ShoppingList {
   /** Array field to store the shopping items */
   private ShoppingItem [] items; 
   /** number of items in the list */
   private int size; 


   /** Default constructor.
   * Constructs an empty 10 item array named "ShoppingList"
   */
   public ShoppingList () {
      items = new ShoppingItem [10]; //10 item array
   }
   
   /** Checks if size of ShoppingList array is less than ten.
   * If so, adds an item to the ShoppingList array.
   * 
   * @param item The Shopping item
   * @return Returns a boolean of true if size of ShoppingItem array is less than ten. Otherwise, return false. 
   */
   public boolean add (ShoppingItem item) {
       if (size < items.length) {
         items[size] = item; 
         size++;
         return true;
       } else {
         return false;
       }
   }

   /** Returns the total cost of all shopping items in this list 
   * @return Returns the total cost of all the items in the Shopping List
   */
   public double getTotalCost () {
      double TotalCost = items[0].getCost();
      
      if (size > 0) {
         for (int i = 1; i < size; i++) {
            TotalCost += items[size].getCost();
            size++;
         }
      }
      return TotalCost;
   }
   
   /** Concatenated format of quantity and name of all the items in Shopping List.
   * @return Concatenated format of string
   */
   @Override
   public String toString () {
      String s = "";
      
      if (size == 0) {
         return "No items in your shopping list!";
         
      } else {
         s = items[0].toString();
            
            if (size > 1) {
               for (int i = 1; i < size; i++) {
                  s += ", " + items[i].toString();
               }
            }
            return "ShoppingList has " + size + " shopping item(s): " + s;
      }
   }

   
   
   /** Searches an item in this list by its name. 
   * Return the item if match is found, otherwise return null.
   * @param itemName User given item name
   * @return returns ShoppingItem if found in the ShoppingList array
   */                                                                                                                                                                                                                                 
   public ShoppingItem searchByName (String itemName) {

      for (int i = 0; i < size; i++) {
         if (itemName.equals(items[i].getName())) { //how to compare string from another class to 
            return items[i];
         }
      }
      return null;
   }
}