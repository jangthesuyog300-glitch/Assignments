const args = process.argv.slice(2, 12);  
if (args.length < 10) {
    console.log(" Please provide 10 numbers");
    process.exit(1);
}


const numbers = args.map(Number);


function isPrime(n) {
    if (n <= 1) return false;
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) return false;
    }
    return true;
}


const sumEvenNumbers = numbers.filter(n => n % 2 === 0).reduce((acc, n) => acc + n, 0);


const sumEvenIndex = numbers.filter((_, idx) => idx % 2 === 0).reduce((acc, n) => acc + n, 0);


const sumPrimes = numbers.filter(isPrime).reduce((acc, n) => acc + n, 0);


console.log("Numbers array:", numbers);
console.log("1) Sum of even numbers:", sumEvenNumbers);
console.log("2) Sum of numbers at even indices:", sumEvenIndex);
console.log("3) Sum of prime numbers:", sumPrimes);
