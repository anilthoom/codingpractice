import './App.css';
import {BrowserRouter as Router, Route, Link} from 'react-router-dom';
import User from './components/User';
import Account from './components/Account';
import Blog from './components/Blog';

function App() {
  return (
    <Router>
      <Route path="/" component={User} />
      <Route path="/account" component={Account} />
      <Route path="/blog" component={Blog} />
    </Router>
  );
}

export default App;
