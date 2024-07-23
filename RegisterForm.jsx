import React from 'react'
import './LoginForm.css';
import { FaUser } from "react-icons/fa";
import { FaLock } from "react-icons/fa";
const LoginForm = () => {
  return (
    <div className='wrapper'>
        <form actions="">
            <h1>Register</h1>
            <div className="input-box">
                <input type="text" placeholder='Username' required/>
                <FaUser className='icon'/>
                
            </div>
            <div className="input-box">
                <input type="password" placeholder='Password' required/>
                <FaLock className='icon' />
            </div>
            <div className="remember-forgot">
                <label>
                    <input type="checkbox"/>Remember me
                </label>
                <a href="#">Forgot password?</a>
            </div>
            <button type="submit">Login</button>
            <div className="register-link">
                <div className="input-box">
                <input type="date of birth" placeholder='Date of birth' required/>
                 
            </div>
              <div className="register-link">
                <div className="text">
                <input type="email" placeholder='Email' required/>
                 
            </div>
            </div>
        </form>
       
    </div>
  )
}

export default LoginForm
