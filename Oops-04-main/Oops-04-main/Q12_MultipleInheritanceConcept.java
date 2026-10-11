// Question 12: Multiple Inheritance Concept Only
// Concept: Why Java does NOT support Multiple Inheritance with Classes (Diamond Problem & Ambiguity)

/*
 * EXPLANATION:
 * Java does NOT support multiple class inheritance (a class extending more than one class).
 * Reason:
 * 1. Diamond Problem / Method Ambiguity:
 *    If Class A and Class B both have a method with the exact same signature (e.g., display()),
 *    and Class C inherits both Class A and Class B, then calling child.display() creates 
 *    ambiguity because the compiler does not know which parent class method to invoke.
 * 2. Simplicity and Maintainability:
 *    Disallowing multiple class inheritance keeps the class hierarchy simple and avoids 
 *    complex state conflict issues.
 */

// Helper Class A
class ParentA {
    public void displayInfo() {
        System.out.println("Display method from ParentA");
    }
}

// Helper Class B
class ParentB {
    public void displayInfo() {
        System.out.println("Display method from ParentB");
    }
}

/*
 * INVALID CODE IN JAVA (Commented out so the file compiles successfully):
 * 
 * class ChildC extends ParentA, ParentB { // COMPILATION ERROR in Java!
 *     // If ChildC calls displayInfo(), it creates ambiguity between ParentA and ParentB.
 * }
 */

public class Q12_MultipleInheritanceConcept {

    // Method inside class to demonstrate/explain the concept
    public static void printMultipleInheritanceExplanation() {
        System.out.println("=== QUESTION 12: MULTIPLE INHERITANCE CONCEPT IN JAVA ===");
        System.out.println("1. Java DOES NOT allow a class to extend multiple classes directly.");
        System.out.println("2. Example of INVALID syntax: 'class Child extends ParentA, ParentB'");
        System.out.println("3. Primary Reason: The Diamond Problem / Method Ambiguity.");
        System.out.println("   If both ParentA and ParentB define displayInfo(), Child cannot decide which one to inherit.");
        System.out.println("4. Result: Java prevents this at compile time for safety and clarity.");
        System.out.println("----------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Program compiles cleanly and outputs concept explanation
        printMultipleInheritanceExplanation();
    }
}
