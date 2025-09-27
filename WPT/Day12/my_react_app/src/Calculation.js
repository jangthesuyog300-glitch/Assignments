import React, { useState } from 'react';

// Function Component with State Management

export default function Calculator({ num1, num2 }) {
  const [n1, setN1] = useState(num1 || '');
  const [n2, setN2] = useState(num2 || '');

  function Addition() {
    return Number(n1) + Number(n2);
  }
  function Subtraction() {
    return Number(n1) - Number(n2);
  }
  function Multiplication() {
    return Number(n1) * Number(n2);
  }
  function Division() {
    return Number(n2) !== 0 ? Number(n1) / Number(n2) : 'Infinity';
  }

  return (
    <div>
      <p>Calculator</p>
      <input
        type="number"
        value={n1}
        onChange={e => setN1(e.target.value)}
        placeholder="First number"
      />
      <input
        type="number"
        value={n2}
        onChange={e => setN2(e.target.value)}
        placeholder="Second number"
      />
      <h2>Addition: {Addition()}</h2>
      <h2>Subtraction: {Subtraction()}</h2>
      <h2>Multiplication: {Multiplication()}</h2>
      <h2>Division: {Division()}</h2>
    </div>
  );
}