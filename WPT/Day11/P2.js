const http = require('http');
const { URL} =require('url');

let todos =[
    { id: 1, task: 'Read Carefully'},
    { id: 2, task: 'Implement'}
];

const server = http.createServer(function(request,res)
{
    const { method, url } =request;

    const parsedUrl =
         new URL(url,`http://${request.headers.host}`);
    const pathname = parsedUrl.pathname;
    
    if (method == 'GET' && pathname == '/todos')
    {
        res.writeHead(200,{ 'Content-Type':'application/json'});
        res.end(JSON.stringify(todos));
    }
})

server.listen(3409, () => (console.log("serverstarted")))