package grocerylist;

public class Items {

    public String groceryItem;
    public String category;
    public int numberOfItem;

    public Items(String groceryItem, String category, int numberOfItem) {
        this.groceryItem = groceryItem;
        this.category = category;
        this.numberOfItem = numberOfItem;
    }

    public String getGroceryItem() {
        return String.format(groceryItem + ": " + category + " | number of items: "  + numberOfItem);
    }

    public String getCategory() {
        return category;
    }

    public int getNumberOfItem() {
        return numberOfItem;
    }
}
