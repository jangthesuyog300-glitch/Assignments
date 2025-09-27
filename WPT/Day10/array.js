
let a = process.argv;


console.log("Array:", a);


for (let i = 0; i < Math.min(10, a.length); i++) 
    {
    console.log(`Element ${i}:`, a[i]);
     }
