import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './StatusTracking.css';

const InquiryList = () => {
  const [inquiries, setInquiries] = useState([]);

  useEffect(() => {
    axios.get('/api/inquiries')
      .then(response => setInquiries(response.data))
      .catch(error => console.error('Error fetching inquiries:', error));
  }, []);

  return (
    <div className="inquiry-list">
      <h1>Inquiry Tracking</h1>
      <ul>
        {inquiries.map(inquiry => (
          <li key={inquiry.id}>
            <p className="inquiry-id"><strong>Inquiry ID:</strong> {inquiry.id}</p>
            <p className="status"><strong>Status:</strong> {inquiry.status}</p>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default InquiryList;