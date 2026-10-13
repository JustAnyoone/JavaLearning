package dev.lpa;

import java.util.ArrayList;
import java.util.List;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.Student;
import dev.lpa.util.QueryList;

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
        // printList(students);
        printMoreLists(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
        // printList(lpaStudents);
        printMoreLists(lpaStudents);

        testsList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testsList(new ArrayList<Integer>(List.of(1, 2, 3)));

        var QueryList = new QueryList<>(lpaStudents);
        var matches = QueryList.getMatches("Course", "Python");
        printMoreLists(matches);

        var students2021 = QueryList.<Student>getMatches(new ArrayList<>(), "YearStarted", "2021");
        printMoreLists(students2021);
    }
    public static void printMoreLists(List<? extends Student> students){

        // Student last = students.get(students.size()-1);
        // students.set(0, last);
        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static void testsList(List<?> list) {

        for (var element : list) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

    // public static void testList(List<String> list){
        
    //     for(var element : list) {
    //         System.out.println("String: " + element.toUpperCase());
    //     }
    // }

    // public static void testList(List<Integer> list){
        
    //     for(var element : list) {
    //         System.out.println("Integer: " + element.floatValue());
    //     }
    // }

    // public static <T extends Student> void printList(List<T> students){

    //     for(var student : students) {
    //         System.out.println(student.getYearStarted() + ": " + student);
    //     }
    //     System.out.println();
    // }
}
