import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import Navbar from './Navbar';
import Footer from './Footer';
import '../Home.css';

const Home = () => {
    const [courses, setCourses] = useState([]);
    const [collegeInfo, setCollegeInfo] = useState({});

    useEffect(() => {
        // Fetch college information
        axios.get('/api/collegeinfo')
            .then(response => setCollegeInfo(response.data))
            .catch(error => console.error('Error fetching college info:', error));

        // Fetch courses
        axios.get('/api/courses')
            .then(response => setCourses(response.data))
            .catch(error => console.error('Error fetching courses:', error));
    }, []);

    return (
        <>
            <Navbar />

            <div className="container">
                <div id="carouselExampleControls" className="carousel slide" data-bs-ride="carousel">
                    <div className="carousel-inner">
                        <div className="carousel-item active">
                            <img src='https://wallpapercave.com/wp/wp2468660.jpg' className="d-block w-100" alt="Slide 1" />
                        </div>
                        <div className="carousel-item">
                            <img src='https://i.pinimg.com/564x/93/79/d2/9379d261dfd39d582b0dc96a09f8a324.jpg' className="d-block w-100" alt="Slide 2" />
                        </div>
                        <div className="carousel-item">
                            <img src='https://i.pinimg.com/564x/25/a4/12/25a412dceef697c9763234f49899ba77.jpg' className="d-block w-100" alt="Slide 3" />
                        </div>
                        <div className="carousel-item">
                            <img src='https://i.pinimg.com/564x/2b/09/97/2b0997961ff2f09aab18ac4c8c6dab02.jpg' className="d-block w-100" alt="Slide 4" />
                        </div>
                        <div className="carousel-item">
                            <img src='https://itechindia.co/wp-content/uploads/2021/11/Blog-Image-1.jpeg' className="d-block w-100" alt="Slide 5" />
                        </div>
                    </div>
                    <button className="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                        <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span className="visually-hidden">Previous</span>
                    </button>
                    <button className="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                        <span className="carousel-control-next-icon" aria-hidden="true"></span>
                        <span className="visually-hidden">Next</span>
                    </button>
                </div>
            </div>

            <div className='main-container'>
                <div className="home-container">
                    <h2 className='my-4 home-heading text-center'>Welcome</h2>
                    <p>{collegeInfo.description || 'Loading college information...'}</p>
                    <b>Institute Type: Private</b>
                    <p>
                        Private college is leading educational organisation in India. Teaching faculty of Private ITI is supreme. ITI is providing latest job-oriented courses for students. This Private ITI is powered by 
                        <b>'Ministry of Skill Development and Entrepreneurship, Government of India for Craftsmen Training Scheme.'</b> ITI is registered by government under <b>NCVT.</b>
                    </p>
                </div>
            </div>

            <h1 className="text-center h1-ubuntu h1-border my-4">Courses Available</h1>
            <div className="course-container h1-ubuntu mb-4">
                <div className="left">
                    {courses.filter(course => course.department === 'Mechanical').map(course => (
                        <div key={course.id} className="image">
                            <Link to={`/course/${course.id}`}>
                                <img src={course.imageUrl} alt={course.name} />
                            </Link>
                            <div className="text">
                                {course.name}
                            </div>
                        </div>
                    ))}
                </div>
                <div className="right">
                    {courses.filter(course => course.department === 'Electrical').map(course => (
                        <div key={course.id} className="image">
                            <Link to={`/course/${course.id}`}>
                                <img src={course.imageUrl} alt={course.name} />
                            </Link>
                            <div className="text">
                                {course.name}
                            </div>
                        </div>
                    ))}
                </div>
            </div>

            <div className="navigation-button-container text-center">
                <p>For more information about our college, visit the About page:</p>
                <Link to="/About" className="btn btn-primary">About</Link>
            </div>

            <Footer />
        </>
    );
}

export default Home;