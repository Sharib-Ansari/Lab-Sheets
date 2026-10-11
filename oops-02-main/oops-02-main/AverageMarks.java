class AverageMarks {
    int[][] marks;

    AverageMarks(int[][] marks) {
        this.marks = marks;
    }

    void calculateAverage() {
        int total = 0;
        int count = 0;

        for (int[] student : marks) {
            for (int mark : student) {
                total += mark;
                count++;
            }
        }

        double average = (double) total / count;

        System.out.println("Average marks = " + average);
    }

    public static void main(String[] args) {
        int[][] marks = {
            {80, 75, 90},
            {70, 85, 80},
            {90, 95, 88}
        };

        AverageMarks obj = new AverageMarks(marks);
        obj.calculateAverage();
    }
}