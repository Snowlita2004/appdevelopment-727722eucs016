// src/components/YourComponent.js

import React, { useEffect, useState } from 'react';
import { fetchInquiries } from '../services/apiService'; // Adjust the path as necessary

const YourComponent = () => {
    const [inquiries, setInquiries] = useState([]);

    useEffect(() => {
        const getInquiries = async () => {
            try {
                const data = await fetchInquiries();
                setInquiries(data);
            } 
            catch (error) 
            {
                console.error('Error fetching inquiries:', error);
            }
        };

        getInquiries();
    }, []);

    return (
        <div>
            <h1>Inquiries</h1>
            <ul>
                {inquiries.map((inquiry) => (
                    <li key={inquiry.id}>{inquiry.content}</li>
                ))}
            </ul>
        </div>
    );
};

export default YourComponent;