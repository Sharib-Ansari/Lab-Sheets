let age = 20;
const name = "Sharib";

console.log("1. Let and Const:");
console.log("Name:", name, "Age:", age);

const square = n => n * n;
console.log("\n2. Arrow Function:");
console.log("Square of 5:", square(5));

console.log("\n3. Template Literal:");
console.log(`My name is ${name} and I am ${age} years old.`);

const student = { name: "Rahul", marks: 85 };
const numbers = [10, 20, 30];

console.log("\n4. Object:");
console.log(student);

console.log("\n5. Array:");
console.log(numbers);

const { marks } = student;
const [first, second] = numbers;
console.log("\n6. Destructuring:");
console.log("Marks:", marks);
console.log("First:", first, "Second:", second);

const newNumbers = [...numbers, 40, 50];
console.log("\n7. Spread Operator:");
console.log(newNumbers);

function total(...values) {
  return values.reduce((sum, n) => sum + n, 0);
}
console.log("\n8. Rest Operator:");
console.log("Total:", total(10, 20, 30));

function greet(user = "Guest") {
  return `Hello, ${user}!`;
}
console.log("\n9. Default Parameter:");
console.log(greet());
console.log(greet("Sharib"));
