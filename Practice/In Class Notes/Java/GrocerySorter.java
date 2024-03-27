public class GrocerySorter {
    public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER}

    public static void main (String[] args) {
        GroceryItem userItem;

        /* Your code will be tested with GR_APPLES and other values for userItem */
        userItem = GroceryItem.GR_APPLES;

        if (userItem == GroceryItem.GR_APPLES) {
            System.out.println("Fruit");
        } else if (userItem == GroceryItem.GR_BANANAS) {
            System.out.println("Fruit");
        } else if (userItem == GroceryItem.GR_JUICE) {
            System.out.println("Drink");
        } else if (userItem == GroceryItem.GR_WATER) {
            System.out.println("Drink");
        }

    }
}