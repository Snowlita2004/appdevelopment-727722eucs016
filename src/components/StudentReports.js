import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './report.css';

const StudentReports = () => {
    const [reports, setReports] = useState([]);

    useEffect(() => {
        axios.get('/api/studentreports')
            .then(response => setReports(response.data))
            .catch(error => console.error('Error fetching student reports:', error));
    }, []);

    return (
        <div className="container">
            <h1 className="my-4 h1-ubuntu h1-border">Student Placement Reports</h1>

            <div className="student-reports-table">
                <table className="table table-bordered table-hover">
                    <thead className="thead-dark">
                        <tr>
                            <th>Name</th>
                            <th>Package</th>
                            <th>Place</th>
                            <th>Company</th>
                            <th>Years of Experience</th>
                        </tr>
                    </thead>
                    <tbody>
                        {reports.map((report, index) => (
                            <tr key={index}>
                                <td>{report.name}</td>
                                <td>{report.packageAmount}</td>
                                <td>{report.place}</td>
                                <td>{report.company}</td>
                                <td>{report.yearsOfExperience}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </div>
    );
};

export default StudentReports;