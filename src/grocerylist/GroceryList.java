package grocerylist;

import java.util.ArrayList;

public class GroceryList {

    public int numberOfItems;
    public ArrayList<String> items;


    public GroceryList() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item){
        this.items.add(item);
    }

}
