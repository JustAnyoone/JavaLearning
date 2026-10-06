package Ex31_AgeValidation;

public class Main {
    public static void main(String[] args) {
        
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(12);
        System.out.println("fullName=" + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        //------------------------------------------------------------
        person.setFirstName("Leon");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("tenn= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullname= " + person.getFullName());
    }
}
