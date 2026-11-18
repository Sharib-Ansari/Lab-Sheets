import java.util.LinkedList;
import java.util.Queue;

class Patient {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class PatientQueueDemo {
    public static void main(String[] args) {
        Queue<Patient> queue = new LinkedList<>();

        queue.add(new Patient(1, "Aman"));
        queue.add(new Patient(2, "Riya"));
        queue.add(new Patient(3, "Palak"));

        System.out.println("Serving Patients:");

        while (!queue.isEmpty()) {
            Patient p = queue.poll();
            p.display();
        }
    }
}