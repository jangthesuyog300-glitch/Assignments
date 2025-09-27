const arr =[10,9,8,7];
let largest =arr[0];
arr.forEach(element =>
    {
        if(element>largest)
    {
        largest=element;
    }
});

console.log("The largest element is : ",largest);