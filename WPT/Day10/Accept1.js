
function multi(a, b) {
    return a * b;
}


function checkNumber(num) {
    return new Promise((resolve, reject) => {
        if (num > 0) {
            resolve("Number is positive!");
        } else {
            reject("Number is zero or negative, rejected!");
        }
    });
}


let num = multi(2, 3); 


checkNumber(num)
    .then(result => console.log(result))  
    .catch(error => console.log(error));


let num2 = multi(-1, 5); 
checkNumber(num2)
    .then(result => console.log(result))
    .catch(error => console.log(error)); 
