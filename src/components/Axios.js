import axios from 'axios';

const fetchInquiries = async () => {
    try {
        const response = await axios.get('http://localhost:8080/api/inquiries');
        console.log(response.data);
    } catch (error) {
        console.error('Error fetching inquiries:', error);
    }
};

// Call the function in your component
fetchInquiries();