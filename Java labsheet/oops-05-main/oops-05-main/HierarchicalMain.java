public class HierarchicalMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(
                "Dr. Rahul", 40, "Cardiology");

        Nurse nurse = new Nurse(
                "Anjali", 30, "Emergency Ward");

        doctor.displayDoctor();
        System.out.println();
        nurse.displayNurse();
    }
}

// Super class
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class 1
class Doctor extends Person {
    private String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayPerson();
        System.out.println("Specialization: " + specialization);
    }
}

// Child class 2
class Nurse extends Person {
    private String ward;

    Nurse(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }

    void displayNurse() {
        displayPerson();
        System.out.println("Ward: " + ward);
    }
}