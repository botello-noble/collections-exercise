package grocerylist;

import java.util.ArrayList;

public class Groceries {

    public String categories;

    private ArrayList<String> groceries;

    public Groceries(String categories) {
        this.categories = categories;
        this.groceries = new ArrayList<>();
    }
    public  ArrayList getGroceries(){
        return this.groceries;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public void addGrocery(String grocery){
        this.groceries.add(grocery);
    }


}
