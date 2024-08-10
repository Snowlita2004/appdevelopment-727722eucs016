
import React, { useEffect, useState } from 'react';
import axios from 'axios';

const Footer = () => {
    const [footerInfo, setFooterInfo] = useState(null);

    useEffect(() => {
        const fetchFooterInfo = async () => {
            try {
                const response = await axios.get('/api/footer/info');
                setFooterInfo(response.data);
            } catch (error) {
                console.error("Error fetching footer info:", error);
            }
        };

        fetchFooterInfo();
    }, []);

    if (!footerInfo) {
        return <footer className="d-flex flex-wrap h2-ubuntu justify-content-center py-3 footer">Loading...</footer>;
    }

    return (
        <footer className="d-flex flex-wrap h2-ubuntu justify-content-center py-3 footer">
            <div className="col-md-6 d-flex flex-column align-items-center">
                <span className="text-light">{footerInfo.copyright}</span>
                <a className='nav-link text-light' href={footerInfo.foundedByLink}>{footerInfo.foundedByText}</a>
            </div>
        </footer>
    );
}

export default Footer;