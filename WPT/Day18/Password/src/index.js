import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import AppDemo from './App';
import reportWebVitals from './reportWebVitals';
// import PasswordGenerator from './PassWord';
import DemoCallBack from './DemoCallback';
import ErrorBoundary from './ErrorBoundry';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode><ErrorBoundary>
    {/* <DemoCallBack></DemoCallBack> */}
  </ErrorBoundary>
   <AppDemo></AppDemo>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
