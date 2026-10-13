public class InheritanceConceptMain {
    public static void main(String[] args) {
        System.out.println("Multiple and Hybrid Inheritance in Java");
        System.out.println("See comments in the source code for explanation.");
    }
}

/*
 * Multiple Inheritance:
 *
 * Multiple inheritance means one child class inherits
 * from two or more parent classes.
 *
 * Java does not allow a class to extend two classes because
 * it can create ambiguity about which parent's method should
 * be used.
 *
 * Invalid idea:
 *
 * class C extends A, B {
 * }
 *
 * The above code is NOT valid Java syntax.
 *
 * Hybrid Inheritance:
 *
 * Hybrid inheritance is a combination of two or more
 * inheritance forms such as hierarchical and multiple inheritance.
 *
 * Java does not support multiple inheritance through classes.
 *
 * Interfaces are commonly used when Java needs multiple
 * inheritance of type/behavior.
 *
 * However, interfaces are intentionally NOT implemented
 * in this program because this question is concept-only.
 */