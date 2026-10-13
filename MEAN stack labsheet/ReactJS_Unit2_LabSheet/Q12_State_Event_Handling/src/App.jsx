import { useState } from 'react';
import './App.css';

function App() {
  const [taskText, setTaskText] = useState('');
  const [tasks, setTasks] = useState([]);

  function addTask(event) {
    event.preventDefault();
    const cleanText = taskText.trim();
    if (!cleanText) return;
    setTasks((current) => [...current, { id: Date.now(), text: cleanText }]);
    setTaskText('');
  }

  function deleteTask(id) {
    setTasks((current) => current.filter((task) => task.id !== id));
  }

  return (
    <main className="page">
      <section className="todo-card">
        <h1>My To-Do List</h1>
        <p>Add your tasks and delete them when they are done.</p>
        <form onSubmit={addTask} className="add-form">
          <input
            value={taskText}
            onChange={(event) => setTaskText(event.target.value)}
            placeholder="Enter a task..."
            aria-label="Task name"
          />
          <button type="submit">Add</button>
        </form>
        {tasks.length === 0 ? (
          <p className="empty">No tasks yet. Add your first task above.</p>
        ) : (
          <ul className="tasks">
            {tasks.map((task) => (
              <li key={task.id}>
                <span>{task.text}</span>
                <button className="delete" type="button" onClick={() => deleteTask(task.id)}>Delete</button>
              </li>
            ))}
          </ul>
        )}
        <p className="total">Total tasks: {tasks.length}</p>
      </section>
    </main>
  );
}

export default App;
