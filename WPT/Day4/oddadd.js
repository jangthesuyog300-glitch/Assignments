
// 1) declare function calculate(...a) 
// 	and display addition of data 
// 	display only odd numbers from given data 

//   call calculate function with multiple parameters 
function odd(...a) {
    let sum = 0;
    console.log("The odd number is :");
    for (let i = 0; i < a.length; i++) {
        sum =sum+a[i];
        if (a[i] % 2 !== 0) {
            odd =a[i];
            console.log(odd);
        }
    }
    console.log("The sum is",sum);
    


}
console.log(odd(1, 2, 3, 4)); 