package grocerylist;
import java.util.Scanner;
import java.util.HashMap;
public class GroceryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
    Groceries produce = new Groceries("produce");

    produce.addGrocery("lettuce");
    produce.addGrocery("orange");
    produce.addGrocery("spinach");
    produce.addGrocery("bell pepper");

    Groceries meat = new Groceries("meat");
    meat.addGrocery("Chicken Breast");
    meat.addGrocery("Pork Chop");
    meat.addGrocery("sirloin");
    meat.addGrocery("bacon");

    Groceries spices = new Groceries("spices");
    spices.addGrocery("Cumin");
    spices.addGrocery("Paprika");
    spices.addGrocery("Garlic Salt");
    spices.addGrocery("Cayenne");

    Groceries carbs = new Groceries("carbs");
    carbs.addGrocery("bread");
    carbs.addGrocery("rice");
    carbs.addGrocery("pasta");
    carbs.addGrocery("potatoes");

        HashMap<String, Groceries> grocery = new HashMap<>();

        grocery.put("produce", produce);
        grocery.put("meat", meat);
        grocery.put("spices", spices);
        grocery.put("carbs", carbs);


        System.out.println("Would you like to create a grocery list?");
        if(input.yesNo()){
            System.out.println("Please select a category");
            for (String key : grocery.keySet()) {
                System.out.format(" ["+key+"] \n");
            }
            String answer = scanner.nextLine();
            if(answer.equals("produce")){
                for(Object produceList : produce.getGroceries() ){
                    System.out.println(produceList);
                }
            } else if (answer.equals("meat")){
                for(Object meatList : meat.getGroceries()){
                    System.out.println(meatList);
                }
            } else if (answer.equals("spices")){
                for(Object spiceList : spices.getGroceries()){
                    System.out.println(spiceList);
                }
            } else if (answer.equals("carbs")){
                for(Object carbsList : carbs.getGroceries()){
                    System.out.println(carbsList);
                }
            }
        }
    }

}

