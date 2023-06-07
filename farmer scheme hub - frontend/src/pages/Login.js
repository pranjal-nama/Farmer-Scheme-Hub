import React, { useEffect, useState } from 'react';
import { useNavigate } from "react-router-dom";

const LoginComponent = () => {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const navigate = useNavigate();

    useEffect(() => {
        if (localStorage.getItem('isLoggedIn'))
            navigate('/');
    }, [navigate]);

    const handleEmailChange = (e) => {
        setEmail(e.target.value);
    };

    const handlePasswordChange = (e) => {
        setPassword(e.target.value);
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        const loginData = {
            email,
            password
        };
        // check if email exists in user table
        localStorage.setItem('isLoggedIn', true);
        navigate('/')
    };

    return (
        <main className='h-full min-h-[100vh] flex'>
            <div className='m-auto w-60 height-40'>
                <h2 className=' text-center text-2xl mb-8 font-medium'>Login to<br />Farmers' Hub</h2>
                <form onSubmit={handleSubmit} className='flex flex-col gap-2'>
                    <label>Email:</label>
                    <input className='p-2 border-[2px] border-gray-700 rounded-md' type="email" value={email} onChange={handleEmailChange} required />

                    <label className='mt-4'>Password:</label>
                    <input className='p-2 border-[2px] border-gray-700 rounded-md' type="password" value={password} onChange={handlePasswordChange} required />

                    <button className='mt-4 p-2 bg-black text-white font-mediums rounded-md' type="submit">Login</button>
                    <p>Don't have an account? <a href='/signup'>Sign up</a></p>
                </form>
            </div>
        </main>
    );
};

export default LoginComponent;
