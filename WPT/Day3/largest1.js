function Largest(arr)
{
    arr.sort((a,b) => a-b);
    return arr[arr.length-1];

}
let arr = [10,9,8,15];
console.log("Largest element is : ",Largest(arr));