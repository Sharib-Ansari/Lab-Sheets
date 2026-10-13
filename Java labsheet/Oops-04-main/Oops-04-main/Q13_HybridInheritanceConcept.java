// Question 13: Hybrid Inheritance Concept Only
// Concept: Hybrid Inheritance in Java (Combination of Multiple & Hierarchical Inheritance)

/*
 * EXPLANATION:
 * Hybrid inheritance is a combination of two or more types of inheritance (e.g. Single + Multiple,
 * or Hierarchical + Multiple).
 * 
 * In Java:
 * 1. Hybrid inheritance using ONLY CLASSES is NOT supported because it relies on Multiple Inheritance,
 *    which Java disallows for classes due to the Diamond Problem and ambiguity.
 * 2. Valid parts like Single Inheritance (Grandparent -> Parent) and Hierarchical Inheritance (Parent -> Child1, Child2)
 *    work perfectly with classes.
 * 3. However, attempting to combine multiple parent classes into a single child class to complete a hybrid loop
 *    causes a compilation error.
 */

// Top base class
class BaseStaff {
    public void role() {
        System.out.println("Base Hospital Staff Role");
    }
}

// Child 1 (Hierarchical branch A)
class DoctorStaff extends BaseStaff {
    public void diagnose() {
        System.out.println("Doctor diagnosing patient");
    }
}

// Child 2 (Hierarchical branch B)
class AdministrativeStaff extends BaseStaff {
    public void manageRecords() {
        System.out.println("Managing hospital records");
    }
}

/*
 * INVALID HYBRID COMBINATION IN JAVA USING CLASSES:
 * 
 * class MedicalDirector extends DoctorStaff, AdministrativeStaff { // COMPILATION ERROR!
 *     // Hybrid inheritance requiring multiple class inheritance is NOT supported in Java.
 * }
 */

public class Q13_HybridInheritanceConcept {

    public static void printHybridInheritanceExplanation() {
        System.out.println("=== QUESTION 13: HYBRID INHERITANCE CONCEPT IN JAVA ===");
        System.out.println("1. Hybrid inheritance combines two or more types of inheritance.");
        System.out.println("2. For example: Combining Hierarchical (BaseStaff -> DoctorStaff & AdministrativeStaff)");
        System.out.println("   with Multiple Inheritance (DoctorStaff & AdministrativeStaff -> MedicalDirector).");
        System.out.println("3. Why Java does NOT support Hybrid Inheritance via Classes:");
        System.out.println("   - Because the multiple inheritance leg ('class MedicalDirector extends DoctorStaff, AdministrativeStaff') is invalid.");
        System.out.println("   - Java forbids extending multiple classes to avoid diamond inheritance ambiguity.");
        System.out.println("4. Conclusion: Pure class-based hybrid inheritance is NOT allowed in Java.");
        System.out.println("---------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Program compiles cleanly and outputs concept explanation
        printHybridInheritanceExplanation();
    }
}
