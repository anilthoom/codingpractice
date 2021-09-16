import { useContext } from "react";
import MeetupList from "../components/meetups/MeetupList";
import FavouritesContext from "../store/favourite-context";

function FavrouitePage(){
    const favouritesCtx = useContext(FavouritesContext);
    let content;
    if(favouritesCtx.totalFavourites === 0){
        content = <p>You got no favourites yet. Start add some?</p>
    } else{
        content = <MeetupList meetups={favouritesCtx.favourites} />
    }
    return (
        <section>
            <h1>My Favourites</h1>
            {content}
        </section>
    );
}

export default FavrouitePage;