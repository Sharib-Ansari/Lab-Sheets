import React from 'react';
import './App.css';

function App() {
  const name = 'Sharib Ansari';
  const course = 'MCA FS';
  const college = 'Coer University';

  return (
    <main className="page">
      <section className="profile-card">
        <p className="eyebrow">UNIT 2 · REACT JS</p>
        <h1>Hello, React! 👋</h1>
        <p className="intro">My first React application is running successfully.</p>
        <div className="details">
          <p><strong>Name:</strong> {name}</p>
          <p><strong>Course:</strong> {course}</p>
          <p><strong>College:</strong> {college}</p>
        </div>
      </section>
    </main>
  );
}

export default App;
