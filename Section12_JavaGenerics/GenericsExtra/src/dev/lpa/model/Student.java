package dev.lpa.model;

import java.util.Random;

import dev.lpa.util.QueryItem;

public class Student implements QueryItem{
    private String name;
    private String course;
    private int yearStarted;
    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        int lastNameIndex = random.nextInt(65,91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2023);
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldname, String value) {
        String fName = fieldname.toUpperCase();
        return switch(fName){
            default -> false;
        };
    }
}
