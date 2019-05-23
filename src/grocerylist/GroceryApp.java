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


        String userInput = "";
        int userNumber = 0;
        HashMap<Integer, Items> listItems = new HashMap<>();
        int t = 0;
        String finalAnswer = "no";


        do {
            System.out.println("Would you like to add an item to a grocery list?");
            if (input.yesNo()) {
                System.out.println("Please select a category");
                for (String key : grocery.keySet()) {
                    System.out.format(" [" + key + "] \n");
                }
                String userCategory = scanner.nextLine();
                if (userCategory.equals("produce")) {
                    for (Object produceList : produce.getGroceries()) {
                        System.out.println(produceList);
                    }
                    System.out.println("Please select your produce.");
                    userInput = scanner.nextLine();
                    System.out.printf("How many %s?", userInput);
                    userNumber = scanner.nextInt();
                } else if (userCategory.equals("meat")) {
                    for (Object meatList : meat.getGroceries()) {
                        System.out.println(meatList);
                    }
                    System.out.println("Please select your meat.");
                    userInput = scanner.nextLine();
                    System.out.printf("How many %s?", userInput);
                    userNumber = scanner.nextInt();
                } else if (userCategory.equals("spices")) {
                    for (Object spiceList : spices.getGroceries()) {
                        System.out.println(spiceList);
                    }
                    System.out.println("Please select your spices.");
                    userInput = scanner.nextLine();
                    System.out.printf("How many %s?", userInput);
                    userNumber = scanner.nextInt();
                } else if (userCategory.equals("carbs")) {
                    for (Object carbsList : carbs.getGroceries()) {
                        System.out.println(carbsList);
                    }
                    System.out.println("Please select your carbs.");
                    userInput = scanner.nextLine();
                    System.out.printf("How many %s?", userInput);
                    userNumber = scanner.nextInt();
                }
                Items userIn = new Items(userCategory, userInput, userNumber);
                listItems.put(t, userIn);
            }
            String x = scanner.nextLine();
            t++;
            System.out.println("Would you like to finalize your order? yes or no");
            finalAnswer = scanner.nextLine();
        } while(finalAnswer.equals("no"));

        for (Integer key : listItems.keySet()) {
            System.out.format(" [" + listItems.get(key).getGroceryItem() + "] \n");
        }
    }

}

