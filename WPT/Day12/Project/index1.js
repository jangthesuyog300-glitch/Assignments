
const  express = require('express'); //import
const f = require('fs');
const p= require('url');
const user1 = require('./MOCK_DATA.json');//import file
const port =3000;//port number for server
const app=express();//data load

app.get('/',(req,res)=>{
    res.send("Hello from express ");
});
app.get('/users',(req,res)=>
{
    //setContant in html
    res.json(user1);
});


//single user data
app.get('/users/:id',(req,res)=>
{
    const id=Number(req.params.id);
    const user =user1.find(
        user=>user.id===id
)
    return res.json(user);
   
});
// delete the element 
app.delete('/delete/:id', (req, res) => {

    const id = Number(req.params.id);  
    // console.log(id);
    const userIndex = user1.findIndex(
        user => user.id === id
    )
    if (userIndex === -1)
        return res.status(404).send('Data not found');

    const deletedItem = user1.splice(userIndex, 1);
    return res.json("Dae ");
});





app.post('/adduser1', (req, res) => {
    // Get data from query string
    const d = p.parse(req.url, true).query;
    console.log("data " + d.email);

    // Create new user object
    const newUser = {
        id: user1.length > 0 ? user1[user1.length - 1].id + 1 : 1,
        first_name: d.first_name,
        last_name: d.last_name,
        email: d.email
    };

    // Add to array
    user1.push(newUser);

    // Save to file
    f.writeFile('./MOCK_DATA.json', JSON.stringify(user1, null, 2), (err) => {
        return res.status(201).json({ message: "User added", user: newUser });
    });
})




app.use(express.urlencoded({ extended: false }))

app.post('/adduser', (req, res) => {
    const data = req.body;// 
    console.log("data " + data.email);
    user1.push(
        { data, id: user1.length + 1 });
    f.writeFile('./MOCK_DATA.json',
        JSON.stringify(user1), (err) => {
            console.log(err)
        });

    return res.json("data added ");

})

app.listen(port,()=> {
  console.log(`Example app listening at http://localhost:${port}/users`);
});
console.log("From start script ");
