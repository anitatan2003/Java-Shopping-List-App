/**
* Each ShoppingItem object models an item under the shopping list.
* 
* @author Anita Tan
* @version 1.1 (April 11 2022)
*/

public class ShoppingItem {
   /** Name of the shopping item */
   private String name; 
   /** Quantity of shopping item*/
   private int quantity; 
   /** price per unit of shopping item*/
   private double price; 

   /** Default constructor.
   * Initializes name, quantity and price of shopping item.
   */
   public ShoppingItem () {
      this.name = name;
      this.quantity = quantity;
      this.price = price;
   }
   
   /** Constructs an item with given name, quantity, and price per unit
   *
   * @param name name of shopping item
   * @param quantity quantity of shopping item
   * @param pricePerUnit pricePerUnit of shopping item
   */
   public ShoppingItem (String name, int quantity, double pricePerUnit) {
      this.name = name;
      this.quantity = quantity;
      this.price = pricePerUnit;
   }
   
   /** Gets and returns the name of item
   * 
   * @return Name of the of shopping item
   */
   public String getName() {
      return name;
   }
   
   /** Gets and returns the total cost of this item in its given quantity.
   *
   * @return Total cost of item given the quantity
   */
   public double getCost () {
      return quantity * price;
   }
   
   /** Gets and returns item quantity
   * @return The item's stored quantity
   */
   public int getQuantity () {
      return quantity;
   }
   
   /** sets this grocery item’s quantity to be the given value
   * @param quantity Given value to override the current quantity of item
   */
   public void setQuantity (int quantity) {
      this.quantity = quantity;
   }
   
   /** returns quantity and the shipping item name separated by space.
   * @return concatenated string of format
   */
   @Override
   public String toString () {
      return quantity + " " + name;
   }
}


