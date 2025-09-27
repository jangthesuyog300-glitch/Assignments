function findLarg(arr){
    let largnum=arr[0];
    for(let i=0;i<arr.length;i++)
    {
        if(arr[i]>largnum)
        {
            largnum =arr[i];
        }
    }
    return largnum;
}
const num1=[10,9,80,7];
const result=findLarg(num1);

console.log("The largest number is : ",result);