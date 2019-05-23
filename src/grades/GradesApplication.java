package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student ryan = new Student("Ryan" );

        ryan.addGrade(100);
        ryan.addGrade(100);
        ryan.addGrade(100);

        Student derek = new Student("Derek" );

        derek.addGrade(90);
        derek.addGrade(100);
        derek.addGrade(98);

        Student nadia = new Student("Nadia" );

        nadia.addGrade(100);
        nadia.addGrade(80);
        nadia.addGrade(90);

        Student alexandra = new Student("Alexandra" );

        alexandra.addGrade(90);
        alexandra.addGrade(80);
        alexandra.addGrade(92);

        HashMap<String, Student> students = new HashMap<>();

        students.put("ryanorsinger", ryan);
        students.put("dereknoble", derek);
        students.put("nadbot", nadia);
        students.put("alexandrafossum", alexandra);


        System.out.println("\nWelcome!\n" +
                "\n" +
                "Here are the github usernames of our students: \n");

        for (String key : students.keySet()) {
            System.out.format(" ["+key+"] \n");
        }

        System.out.println("What student would you like to see more information on?");

        scanner.nextLine();






    }


}
