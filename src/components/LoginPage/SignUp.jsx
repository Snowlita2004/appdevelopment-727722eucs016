import React, { useState } from 'react';
import { Link, useNavigate } from 'react-router-dom';
import '../SignUp.css';

const SignUp = () => {
  const navigate = useNavigate();
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');

  const goToLogin = () => {
    navigate('/Login');
  };

  const validatePassword = (password) => {
    const passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
    return passwordRegex.test(password);
  };

  const handleSignUp = () => {
    if (password === confirmPassword) {
      if (validatePassword(password)) {
        console.log('Sign up successful');
        
        console.log('Name:', name);
        console.log('Email:', email);
        console.log('Password:', password);
        navigate('/Home');
      } else {
        alert(
          'Password must have one uppercase letter, one lowercase letter, one number, one symbol, and be at least 8 characters long.'
        );
      }
    } else {
      alert('Passwords do not match');
    }
  };

  return (
    <div className="loginsignup">
      <div className="login-signup-container">
      <h1>Welcome</h1>
      <p className="loginsignup-">
          Are you a admin? <Link to="/admin-signup"><span>Register here</span></Link>
        </p>
        <p id="para"></p>
        <div className="loginsignup-fields">
          <input type="text" placeholder="Your Name" value={name} onChange={(e) => setName(e.target.value)} />
          <input type="email" placeholder="Email Address" value={email} onChange={(e) => setEmail(e.target.value)} />
          <input type="password" placeholder="New Password" value={password} onChange={(e) => setPassword(e.target.value)} />
          <input
            type="password"
            placeholder="Confirm Password"
            value={confirmPassword}
            onChange={(e) => setConfirmPassword(e.target.value)}
          />
        </div>
        <div className="loginsignup-agree">
          <input type="checkbox" name="" id="" />
          <p>By continuing, I agree to the terms of use & privacy policy</p>
        </div>
        <button onClick={handleSignUp}>SignUp</button>
        <p>Or</p>
        <button onClick={goToLogin}>Login</button>
        
       
      </div>
    </div>
  );
};

export default SignUp;