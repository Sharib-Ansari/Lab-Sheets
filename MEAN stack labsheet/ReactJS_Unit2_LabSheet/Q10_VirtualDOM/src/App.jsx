import { useEffect, useState } from 'react';
import './App.css';

function App() {
  const [time, setTime] = useState(() => new Date());
  const [reactCount, setReactCount] = useState(0);

  useEffect(() => {
    const timerId = setInterval(() => setTime(new Date()), 1000);
    return () => clearInterval(timerId);
  }, []);

  useEffect(() => {
    const root = document.getElementById('vanilla-counter');
    if (!root) return undefined;

    root.innerHTML = `
      <p class="count" id="vanilla-count">0</p>
      <button type="button" id="vanilla-increment">Increase plain JS count</button>
      <button type="button" id="vanilla-reset">Reset</button>
    `;

    let count = 0;
    const countText = root.querySelector('#vanilla-count');
    const increaseButton = root.querySelector('#vanilla-increment');
    const resetButton = root.querySelector('#vanilla-reset');

    const increase = () => {
      count += 1;
      countText.textContent = String(count);
    };
    const reset = () => {
      count = 0;
      countText.textContent = String(count);
    };

    increaseButton.addEventListener('click', increase);
    resetButton.addEventListener('click', reset);

    return () => {
      increaseButton.removeEventListener('click', increase);
      resetButton.removeEventListener('click', reset);
      root.innerHTML = '';
    };
  }, []);

  return (
    <main className="page">
      <h1>Virtual DOM in Action</h1>
      <p className="clock">Live clock: <strong>{time.toLocaleTimeString()}</strong></p>
      <div className="columns">
        <section className="counter-card">
          <h2>React Counter</h2>
          <p className="count">{reactCount}</p>
          <button type="button" onClick={() => setReactCount((n) => n + 1)}>Increase React count</button>
          <button type="button" onClick={() => setReactCount(0)}>Reset</button>
          <p className="note">React updates the changed text through state and rendering.</p>
        </section>
        <section className="counter-card">
          <h2>Plain JavaScript Counter</h2>
          <div id="vanilla-counter" />
          <p className="note">This counter is created with innerHTML and updated with textContent.</p>
        </section>
      </div>
      <p className="tip">Open DevTools → Elements, change either counter, and compare the updated text nodes.</p>
    </main>
  );
}

export default App;
