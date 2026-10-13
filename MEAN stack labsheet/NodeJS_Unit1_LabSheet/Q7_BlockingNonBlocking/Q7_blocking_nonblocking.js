// Q7. Blocking vs. Non-blocking Code
// Run: node Q7_blocking_nonblocking.js
// Then visit http://localhost:3000/fast and http://localhost:3000/slow

const fs = require("fs");
const path = require("path");
const http = require("http");

const samplePath = path.join(__dirname, "sample.txt");

// Create sample.txt automatically if it does not exist, so this file is easy to run.
if (!fs.existsSync(samplePath)) {
    fs.writeFileSync(
        samplePath,
        "This is sample.txt. It is used to demonstrate blocking and non-blocking file reading.\n",
        "utf8"
    );
}

console.log("Q7: Blocking vs. Non-blocking Code\n");

// 1. Blocking read: the program waits for the file to be read.
console.log("1. fs.readFileSync:");
const syncData = fs.readFileSync(samplePath, "utf8");
console.log(syncData.trim());

// 2. Non-blocking callback read: Node.js continues while the read happens.
fs.readFile(samplePath, "utf8", (err, data) => {
    if (err) {
        console.error("fs.readFile error:", err.message);
        return;
    }
    console.log("\n2. fs.readFile callback:");
    console.log(data.trim());
});

// 3. Promise-based read using async/await.
async function readWithPromises() {
    try {
        const data = await fs.promises.readFile(samplePath, "utf8");
        console.log("\n3. fs.promises with async/await:");
        console.log(data.trim());
    } catch (err) {
        console.error("fs.promises error:", err.message);
    }
}

function startServer() {
    const server = http.createServer((req, res) => {
        const url = new URL(req.url, `http://${req.headers.host}`);

        if (url.pathname === "/fast") {
            res.writeHead(200, { "Content-Type": "text/plain; charset=utf-8" });
            res.end("FAST route responded quickly.\n");
            console.log("/fast request handled");
            return;
        }

        if (url.pathname === "/slow") {
            console.log("/slow started: blocking the event loop for 5 seconds...");
            const start = Date.now();
            // This busy loop intentionally blocks Node.js for about 5 seconds.
            while (Date.now() - start < 5000) {
                // Blocking work for demonstration only.
            }
            res.writeHead(200, { "Content-Type": "text/plain; charset=utf-8" });
            res.end("SLOW route finished after a 5-second blocking loop.\n");
            console.log("/slow finished");
            return;
        }

        res.writeHead(200, { "Content-Type": "text/plain; charset=utf-8" });
        res.end(
            "Open /fast for an immediate response or /slow for a 5-second blocking loop.\n"
        );
    });

    server.listen(3000, () => {
        console.log("\nHTTP server is running at http://localhost:3000");
        console.log("Open http://localhost:3000/fast and http://localhost:3000/slow");
        console.log("To observe blocking: open /slow, then quickly request /fast in another tab.");
        console.log("Stop the server with Ctrl+C in the terminal.");
    });
}

readWithPromises().finally(startServer);
