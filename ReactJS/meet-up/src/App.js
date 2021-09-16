import { Route, Switch } from "react-router";
import MainNavigation from "./components/layout/MainNavigation";
import AllMeetupsPage from "./pages/AllMeetups";
import FavrouitePage from "./pages/Favourite";
import NewMeetupPage from "./pages/NewMeetup";

function App() {
  return (
    <div>
      <MainNavigation />
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
    </div>
  );
}

export default App;
