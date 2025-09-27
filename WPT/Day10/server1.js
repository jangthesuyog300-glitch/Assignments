// Load the HTTP module
const http = require('http');

// Create the server
const server = http.createServer((req, res) => {
  // Set response header
  res.writeHead(200, { 'Content-Type': 'text/plain' });

  // Send response body
  res.end('Hello, World! From Node.js Server 🚀\n');
});

// Define port
const PORT = 8080;

// Start the server
server.listen(PORT, () => {
  console.log(`Server is running at http://localhost:${PORT}/`);
});
