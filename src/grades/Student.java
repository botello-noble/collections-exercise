package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;

    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){

        for (int i = 1; i <= grades.size(); i++) {
            return grades.get(i) / i;
        }

        return 1;
    }

    public static void main(String[] args) {

        Student one = new Student("David", 80, 90);


    }



}
