package Section7_OOP.POJOsRecordProject;

public class Main {
    public static void main(String[] args) {
        
        for  (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                switch (i) {
                    case 1 -> "Mary";
                    case 2 -> "Carol";
                    case 3 -> "Tim";
                    case 4 -> "Harry";
                    case 5 -> "Lisa";
                    default -> "Anonymous";
                },
                "05/11/1985",
                "Java Masterclass");
                System.out.println(s);
        } 

        Student pojoStudent = new Student("S923006", "Bill Gates", "10/28/1955", "JaavaMasterclass");
        LPAStudent recordStudent = new LPAStudent("S92307","Tim Maia", "09/09/2009","JavaMasterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        // recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829"); 
        // -> set doens't work in a Record, because is a immutable
        // if you wanted to change a object use a POJO
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
