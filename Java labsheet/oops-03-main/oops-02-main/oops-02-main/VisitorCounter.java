class VisitorCounter {
    int visitors;

    VisitorCounter(int visitors) {
        this.visitors = visitors;
    }

    void demonstrate() {
        System.out.println("Initial visitors = " + visitors);

        System.out.println("Postfix increment = " + visitors++);
        System.out.println("After postfix = " + visitors);

        System.out.println("Prefix increment = " + (++visitors));
        System.out.println("After prefix = " + visitors);

        System.out.println("Postfix decrement = " + visitors--);
        System.out.println("After postfix decrement = " + visitors);

        System.out.println("Prefix decrement = " + (--visitors));
    }

    public static void main(String[] args) {
        VisitorCounter obj = new VisitorCounter(10);
        obj.demonstrate();
    }
}