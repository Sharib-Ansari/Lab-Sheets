class ArmstrongNumbers {

    boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        return sum == original;
    }

    void display() {
        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        ArmstrongNumbers obj = new ArmstrongNumbers();
        obj.display();
    }
}