import TodoItem from "./components/TodoItem";

function App() {
  return (
    <div>
      <h1>My Todo</h1>
      <input type="text"></input>
      <button>Add</button>
      <TodoItem />
    </div>
  );
}

export default App;
