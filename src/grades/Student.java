package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
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
        double totalGrades = 0;
        double numberOfGrades = grades.size();
        for (int i = 0; i < grades.size(); i++) {
            totalGrades += grades.get(i);
            System.out.println(totalGrades);

        }
        return totalGrades/ numberOfGrades;
    }

    public static void main(String[] args) {

        Student one = new Student("David" );

        one.addGrade(50);
        one.addGrade(100);
        System.out.println(one.getGradeAverage());


    }



}
