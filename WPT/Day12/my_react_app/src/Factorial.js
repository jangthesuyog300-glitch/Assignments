import React, { useState } from 'react';

export default function Factorial({ number }) {
  const [num, setNum] = useState(number || '');

  function getFactorial(n) {
    if (n < 0) return 'Invalid';
    if (n === 0 || n === 1) return 1;
    let fact = 1;
    for (let i = 2; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  return (
    <div>
      <h2>Factorial Calculator</h2>
      <input
        type="number"
        value={num}
        onChange={e => setNum(e.target.value)}
        placeholder="Enter a number"
      />
      <h3>
        Factorial of {num === '' ? '?' : num} is {num === '' ? '?' : getFactorial(Number(num))}
      </h3>
    </div>
  );
}