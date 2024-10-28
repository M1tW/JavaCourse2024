public class GroceryTest {
    public static void main(String[] args) {
        GroceryItemOrder item1 = new GroceryItemOrder("Milk", 1.50);
        item1.setQuantity(3);

        GroceryItemOrder item2 = new GroceryItemOrder("Bread", 2.00);
        item2.setQuantity(5);

        GroceryItemOrder item3 = new GroceryItemOrder("Eggs", 0.20);
        item3.setQuantity(12);

        GroceryList groceryList = new GroceryList();
        groceryList.add(item1);
        groceryList.add(item2);
        groceryList.add(item3);

        System.out.println(groceryList);
    }
}
