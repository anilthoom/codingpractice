import Todo from "./components/Todo";

function App() {
  return (<div>
    <h1>My Todos</h1>
    <Todo text='Learn React'/>
    <Todo text='Learn Kafka'/>
    <Todo text='Learn Docker'/>
  </div>);
}

export default App;
