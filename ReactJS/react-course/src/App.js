import Backdrop from "./components/Backdrop";
import Modal from "./components/Modal";
import Todo from "./components/Todo";

function App() {
  return (<div>
    <h1>My Todos</h1>
    <Todo text='Learn React'/>
    <Todo text='Learn Kafka'/>
    <Todo text='Learn Docker'/>
    <Todo text='Learn K8s'/>
  </div>);
}

export default App;
