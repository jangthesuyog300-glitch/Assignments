console.log('First');
setTimeout(()=> console.log('in time out'),0);
console.log('Third');
Promise.resolve().then(()=>
console.log('Second'));