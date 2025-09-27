const http = require('http');
const url = require('url');

const server = http.createServer((req, res)=>
{
    const parsedUrl = url.parse(req.url, true);

    const query = parsedUrl.query;

    const fName =query.fName || 'Guest';
    const lName =query.lName || '';

    res.writeHead(200, { 'Content-Type':'text/html'});

    res.end(`<h1>Hello ${fName} ${lName}</h1>`)
});

server.listen(8080, () => {
    console.log('Server running at http://localhost:8080');
});