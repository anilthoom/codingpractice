const DUMMY_DATA = [
    {
        id: 'm1',
        title: 'Taj Mahal',
        image: 'https://en.wikipedia.org/wiki/Taj_Mahal#/media/File:Taj_Mahal_in_India_-_Kristian_Bertel.jpg',
        address: 'Dharmapuri, Forest Colony, Tajganj, Agra, Uttar Pradesh 282001',
        description: 'The Taj Mahal, is an ivory-white marble mausoleum on the southern bank of the river Yamuna in the Indian city of Agra. It was commissioned in 1632 by the Mughal emperor Shah Jahan to house the tomb of his favourite wife, Mumtaz Mahal; it also houses the tomb of Shah Jahan himself.'
    },
    {
        id: 'm2',
        title: 'Statue of Unity',
        image: 'https://en.wikipedia.org/wiki/Statue_of_Unity#/media/File:Statue_of_Unity.jpg',
        address: 'Sardar Sarovar Dam, Statue of Unity Rd, Kevadia, Gujarat 393155',
        description: 'The Statue of Unity is a colossal statue of Indian statesman and independence activist Vallabhbhai Patel, who was the first deputy prime minister and home minister of independent India and an adherent of Mahatma Gandhi during the nonviolent Indian Independence movement.'
    }
];

function AllMeetupsPage(){
    return (
        <section>
            <h1>All Meetups</h1>
            <ul>
                {DUMMY_DATA.map( (meetup) => {
                    return <li key={meetup.id}>{meetup.title}</li>;
                })}
            </ul>
        </section>
    );
}

export default AllMeetupsPage;