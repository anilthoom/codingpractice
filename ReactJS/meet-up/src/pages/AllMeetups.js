import { useEffect, useState } from "react";
import MeetupList from "../components/meetups/MeetupList";

const DUMMY_DATA = [
    {
        id: 'm1',
        title: 'Taj Mahal',
        image: 'https://asia.olympus-imaging.com/content/000107506.jpg',
        address: 'Dharmapuri, Forest Colony, Tajganj, Agra, Uttar Pradesh 282001',
        description: 'The Taj Mahal, is an ivory-white marble mausoleum on the southern bank of the river Yamuna in the Indian city of Agra. It was commissioned in 1632 by the Mughal emperor Shah Jahan to house the tomb of his favourite wife, Mumtaz Mahal; it also houses the tomb of Shah Jahan himself.'
    },
    {
        id: 'm2',
        title: 'Statue of Unity',
        image: 'https://asia.olympus-imaging.com/content/000107511.jpg',
        address: 'Sardar Sarovar Dam, Statue of Unity Rd, Kevadia, Gujarat 393155',
        description: 'The Statue of Unity is a colossal statue of Indian statesman and independence activist Vallabhbhai Patel, who was the first deputy prime minister and home minister of independent India and an adherent of Mahatma Gandhi during the nonviolent Indian Independence movement.'
    }
];

function AllMeetupsPage(){
    const [isLoading, setIsLoading] = useState(true);
    const [loadedMeetups, setLoadedMetups] = useState([]);

    useEffect(() => {
            setIsLoading(true);
            fetch(
            'https://react-meetup-c32f2-default-rtdb.firebaseio.com/meetups.json'
            ).then(response => {
                return response.json();
            }).then(data => {
                const meetups = [];
                for(const key in data){
                    const meetup = {
                        id: key,
                        ...data[key]
                    };
                    meetups.push(meetup);
                }
                setIsLoading(false);
                setLoadedMetups(meetups);
            });
    }, []);
    
    if(isLoading){
        return(
            <section>
                <p>Loading...</p>
            </section>
        );
    }
    return (
        <section>
            <h1>All Meetups</h1>
            <MeetupList meetups={loadedMeetups}/>
        </section>
    );
}

export default AllMeetupsPage;