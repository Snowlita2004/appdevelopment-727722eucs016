import React, { useEffect, useState } from 'react';
import './Gym.css';
import axios from 'axios';

const Gym = () => {
    const [gym, setGym] = useState(null);

    useEffect(() => {
        // Replace `1` with the ID you want to fetch
        axios.get('/api/gyms/1')
            .then(response => {
                setGym(response.data);
            })
            .catch(error => {
                console.error('There was an error fetching the gym data!', error);
            });
    }, []);

    return (
        <div className="gym-container">
            {gym ? (
                <>
                    <h1>{gym.name}</h1>
                    <img src={gym.imageUrl} alt="Gym" className="gym-image" />
                    <div className="gym-info">
                        <p>{gym.description}</p>
                        <h2>Key Aspects of the Gym:</h2>
                        <ol>
                            {gym.keyAspects.split(',').map((aspect, index) => (
                                <li key={index}>{aspect}</li>
                            ))}
                        </ol>
                    </div>
                </>
            ) : (
                <p>Loading...</p>
            )}
        </div>
    );
}

export default Gym;