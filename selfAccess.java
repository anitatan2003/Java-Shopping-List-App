public class selfAccess {
   public static void main (String[] args) {
      tri (3);
   }
   
   public static void tri (int size) {
      for (int k = 0; k <= size; k++) { //number of rows = size number
          System.out.println();
            for (int i = size; i > k; i--) { //print squares as long as it's bigger than k 
               System.out.print(i*i + " ");
            }
      }
   }
}