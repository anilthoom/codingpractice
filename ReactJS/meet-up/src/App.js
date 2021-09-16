import { Route } from "react-router";
import AllMeetupsPage from "./pages/AllMeetups";
import FavrouitePage from "./pages/Favourite";
import NewMeetupPage from "./pages/NewMeetup";

function App() {
  return (
    <div>
      <Route path='/'>
        <AllMeetupsPage></AllMeetupsPage>
      </Route>
      <Route path='/new-meetup'>
        <NewMeetupPage></NewMeetupPage>
      </Route>
      <Route path='/favourites'>
        <FavrouitePage></FavrouitePage>
      </Route>
    </div>
    );
}

export default App;
