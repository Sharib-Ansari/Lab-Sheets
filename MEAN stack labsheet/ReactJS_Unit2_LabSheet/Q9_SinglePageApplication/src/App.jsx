import { useState } from 'react';
import './App.css';

function App() {
  const [view, setView] = useState('Home');

  const content = {
    Home: {
      heading: 'Welcome Home!',
      message: 'This is the Home view of our small single-page application.'
    },
    About: {
      heading: 'About Us',
      message: 'This app uses React useState to change views without reloading the page.'
    },
    Contact: {
      heading: 'Contact Us',
      message: 'Email: student@example.com'
    }
  };

  return (
    <main className="page">
      <section className="app-card">
        <h1>Single Page Application</h1>
        <p className="hint">Choose a view. The page should not reload.</p>
        <nav className="nav" aria-label="Main navigation">
          {Object.keys(content).map((item) => (
            <button
              key={item}
              className={view === item ? 'active' : ''}
              onClick={() => setView(item)}
              type="button"
            >
              {item}
            </button>
          ))}
        </nav>
        <article className="view" aria-live="polite">
          <h2>{content[view].heading}</h2>
          <p>{content[view].message}</p>
          <small>Current view: {view}</small>
        </article>
      </section>
    </main>
  );
}

export default App;
