import { useState } from 'react';
import './App.css';

function App() {
  const [count, setCount] = useState(0);

  return (
    <main className="page">
      <section className="build-card">
        <p className="eyebrow">Q13 · PRODUCTION BUILD</p>
        <h1>React App Booted Successfully</h1>
        <p>This app is running with React StrictMode and Vite.</p>
        <p className="count">Counter: {count}</p>
        <button type="button" onClick={() => setCount((current) => current + 1)}>Increase counter</button>
        <p className="note">Check the browser console for the startup message.</p>
      </section>
    </main>
  );
}

export default App;
