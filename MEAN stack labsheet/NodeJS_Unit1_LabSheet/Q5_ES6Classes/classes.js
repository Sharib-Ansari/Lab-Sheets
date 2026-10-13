class Student {
  constructor(name, marks) {
    this.name = name;
    this.marks = marks;
  }

  display() {
    console.log(`${this.name} scored ${this.marks}`);
  }
}

class GradStudent extends Student {
  constructor(name, marks, degree) {
    super(name, marks);
    this.degree = degree;
  }

  display() {
    console.log(`${this.name} scored ${this.marks} in ${this.degree}`);
  }
}

const students = [
  new Student("Aman", 75),
  new Student("Rahul", 55),
  new GradStudent("Sharib", 90, "BCA"),
  new Student("Priya", 65),
  new GradStudent("Neha", 45, "MCA")
];

console.log("All Students:");
students.forEach(student => student.display());

const passedStudents = students.filter(student => student.marks > 60);
const result = passedStudents.map(student => `${student.name}: ${student.marks}`);

console.log("\nStudents Scoring Above 60:");
result.forEach(student => console.log(student));
