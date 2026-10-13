class SkipSquares {

    boolean isPerfectSquare(int number) {
        int root = (int) Math.sqrt(number);
        return root * root == number;
    }

    void display() {
        for (int i = 1; i <= 50; i++) {
            if (isPerfectSquare(i)) {
                continue;
            }

            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        SkipSquares obj = new SkipSquares();
        obj.display();
    }
}