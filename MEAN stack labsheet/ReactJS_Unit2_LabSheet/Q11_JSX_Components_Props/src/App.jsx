import './App.css';

function Header() {
  return <header className="header"><h1>Student Result Cards</h1><p>React components and props</p></header>;
}

function Card({ name, course, marks }) {
  return (
    <article className="card">
      <h2>{name}</h2>
      <p><strong>Course:</strong> {course}</p>
      <p><strong>Marks:</strong> {marks}</p>
      <span className={marks >= 60 ? 'badge pass' : 'badge'}>{marks >= 60 ? 'Pass' : 'Needs improvement'}</span>
    </article>
  );
}

function Footer() {
  return <footer className="footer">Created with React and JSX</footer>;
}

function App() {
  const students = [
    { id: 1, name: 'Sharib Ansari', course: 'BCA', marks: 88 },
    { id: 2, name: 'Aman Kumar', course: 'BCA', marks: 72 },
    { id: 3, name: 'Priya Sharma', course: 'BCA', marks: 56 }
  ];

  return (
    <div className="page">
      <Header />
      <main className="cards">
        {students.map((student) => <Card key={student.id} name={student.name} course={student.course} marks={student.marks} />)}
      </main>
      <Footer />
    </div>
  );
}

export default App;
