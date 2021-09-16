import { useContext } from 'react';
import FavouritesContext from '../../store/favourite-context';
import Card from '../ui/Card';
import classes from './MeetupItem.module.css';

function MeetupItem(props) {
    
    const favouritesCtx = useContext(FavouritesContext);
    const itemIsFavourite = favouritesCtx.itemIsFavourite(props.id);
    function toggleFavouritesStatusHandler(){
        debugger;
        if(itemIsFavourite){
            favouritesCtx.removeFavourites(props.id);
        } else{
            favouritesCtx.addFavourites({
                id: props.id,
                title: props.title,
                image: props.image,
                description: props.description,
                address: props.address
            });
        }
    }
    return (
        <li className={classes.item}>
            <Card>
                <div className={classes.image}>
                    <img src={props.image} alt={props.title} />
                </div>
                <div className={classes.content}>
                    <h3> {props.title} </h3>
                    <address> {props.address} </address>
                    <p>{props.description}</p>
                </div>
                <div className={classes.actions}>
                    <button onClick={toggleFavouritesStatusHandler}>{itemIsFavourite? 'Remove item from favourites': 'To favourites'}</button>
                </div>
            </Card>
        </li>
    );
}

export default MeetupItem;