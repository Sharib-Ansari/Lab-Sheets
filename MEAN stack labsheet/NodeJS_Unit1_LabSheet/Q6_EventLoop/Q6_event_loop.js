// Q6. Event Loop and Process Object
// Run: node Q6_event_loop.js
// Optional: node Q6_event_loop.js hello

console.log("Q6: Event Loop and Process Object");
console.log("1. Synchronous log - Start");

setTimeout(() => {
    console.log("4. setTimeout(0)");
}, 0);

setImmediate(() => {
    console.log("5. setImmediate");
});

Promise.resolve().then(() => {
    console.log("3. Promise.then");
});

process.nextTick(() => {
    console.log("2. process.nextTick");
});

console.log("1. Synchronous log - End");

// Predicted order:
// Start, End, process.nextTick, Promise.then, then setTimeout/setImmediate.
// Note: At top level, setTimeout(0) and setImmediate can appear in either order
// depending on timing and Node.js version/runtime conditions.

console.log("\nProcess information:");
console.log("Process ID (pid):", process.pid);
console.log("Platform:", process.platform);
console.log("Arguments (argv):", process.argv);
console.log("Memory usage:", process.memoryUsage());
