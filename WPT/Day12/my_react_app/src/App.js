import React from 'react';
import './App.css';
import Calculator from './Calculation';
import Factorial from './Factorial';

function App() {
  return (
    <div className="App">
      <h1>React Calculator & Factorial</h1>
      <Calculator num1 num2 />
      <Factorial number={5} />
    </div>
  );
}

export default App;
