function Add() {
    return (
        <>
            <li>4</li>
            <Factorial number={4} />
        </>
    );
}

function Factorial({ number }) {
    let result = 1;
    for (let i = 1; i <= number; i++) {
        result *= i;
    }

    return (
        <>
            <li>Factorial of {number} is {result}</li>
        </>
    );
}

export default Add;
