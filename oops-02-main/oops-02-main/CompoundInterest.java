import java.util.Scanner;

class CompoundInterest {
    double principal, rate, time;

    CompoundInterest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    void calculate() {
        double amount = principal * Math.pow((1 + rate / 100), time);
        double ci = amount - principal;

        System.out.println("Compound Interest = " + ci);
        System.out.println("Amount = " + amount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        CompoundInterest obj = new CompoundInterest(p, r, t);
        obj.calculate();
    }
}