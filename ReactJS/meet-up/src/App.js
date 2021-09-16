import { Route, Switch } from "react-router";
import Layout from "./components/layout/Layout";
import AllMeetupsPage from "./pages/AllMeetups";
import FavrouitePage from "./pages/Favourite";
import NewMeetupPage from "./pages/NewMeetup";

function App() {
  return (
    <Layout>
      <Switch>
        <Route path='/' exact>
          <AllMeetupsPage></AllMeetupsPage>
        </Route>
        <Route path='/new-meetup'>
          <NewMeetupPage></NewMeetupPage>
        </Route>
        <Route path='/favourites'>
          <FavrouitePage></FavrouitePage>
        </Route>
      </Switch>
    </Layout>
  );
}

export default App;
