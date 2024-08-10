import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './food.css'; 

const AboutFoodCourt = () => {
    const [foodCourtInfo, setFoodCourtInfo] = useState(null);

    useEffect(() => {
        const fetchFoodCourtInfo = async () => {
            try {
                const response = await axios.get('/api/foodcourt/info');
                setFoodCourtInfo(response.data);
            } catch (error) {
                console.error("Error fetching food court info:", error);
            }
        };

        fetchFoodCourtInfo();
    }, []);

    if (!foodCourtInfo) {
        return <p>Loading...</p>;
    }

    return (
        <div className="about-food-court-container">
            <div className="about-food-court-image">
                <img src={foodCourtInfo.imageUrl} alt="Food Court" />
            </div>
            <div className="about-food-court-text">
                <h2>{foodCourtInfo.title}</h2>
                <ul>
                    {foodCourtInfo.details.map((detail, index) => (
                        <li key={index}>{detail}</li>
                    ))}
                </ul>
            </div>
        </div>
    );
}

export default AboutFoodCourt;