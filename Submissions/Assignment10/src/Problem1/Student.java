package Problem1;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private ArrayList<Double> grades;

    Student(String name, int age, ArrayList<Double> grades){
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public void setAge(int age) {
        this.age = age;
    }

    ArrayList<Double> getGrades(){
        return this.grades;
    }

    String getName(){
        return this.name;
    }

    int getAge() {
        return this.age;
    }
}
