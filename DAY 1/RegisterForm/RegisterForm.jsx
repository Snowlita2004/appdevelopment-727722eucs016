import React from 'react'
import './RegisterForm.css';
import { FaUser } from "react-icons/fa";
import { FaLock } from "react-icons/fa";
import { BsCalendar2DateFill } from "react-icons/bs";
import { MdEmail } from "react-icons/md";
const RegisterForm = () => {
  return (
    <div className='wrapper'>
        <form actions="">
            <h1>Register Form</h1>
            <div className="input-box">
                <input type="text" placeholder='Username' required/>
                <FaUser className='icon'/>
                
            </div>
             <div className="input-box">
 
                <input type="text" placeholder='Date Of Birth' required/> 
                <BsCalendar2DateFill className='icon' />
             </div>
             <div className="input-box">
                <input type="text" placeholder='Email' required/>
                <MdEmail className='icon'/>
             </div>
            <div className="input-box">
                <input type="password" placeholder='Password' required/>
                <FaLock className='icon' />
            </div>
            <div className="remember-forgot">
                <label>
                    <input type="checkbox"/>
                    Remember me
                </label>
             
            </div>
            <button type="submit">Register!</button>
             
        </form>
       
    </div>
  )
}

export default RegisterForm
