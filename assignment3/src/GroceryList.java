import java.util.ArrayList;

public class GroceryList {
    private ArrayList<GroceryItemOrder> items;
    private static final int MAX_ITEMS = 10;

    public GroceryList() {
        items = new ArrayList<>();
    }

    public void add(GroceryItemOrder item) {
        if (items.size() < MAX_ITEMS) {
            items.add(item);
        } else {
            System.out.println("The grocery list is full. Cannot add more items.");
        }
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (GroceryItemOrder item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Grocery List:\n");
        for (GroceryItemOrder item : items) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("Total Cost: $").append(getTotalCost());
        return sb.toString();
    }
}
