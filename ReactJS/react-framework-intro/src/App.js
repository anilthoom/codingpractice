import './App.css';
import {BrowserRouter as Router, Route, Link} from 'react-router-dom';
import User from './components/User';
import Account from './components/Account';
import Blog from './components/Blog';

function App() {
  return (
    <Router>
      <div>
        <div>
          <Link to="/">Home</Link> | 
          <Link to="/account">Account</Link> | 
          <Link to="/blog">Blog</Link>
        </div>
        <hr />
        <Route exact path="/" component={User} />
        <Route path="/account" component={Account} />
        <Route path="/blog" component={Blog} />
      </div>
    </Router>
  );
}

export default App;
