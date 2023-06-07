import React, { useState, useEffect } from 'react';
import './App.css';
import { useNavigate } from 'react-router';

export default function App() {
  const [data, setData] = useState([]);
  const navigate = useNavigate();

  const logout = () => {
    localStorage.removeItem('isLoggedIn');
    navigate('/login');
  }

  const viewSchemeDetails = (id) => {
    navigate(`/scheme/${id}`);
  };

  useEffect(() => {
    console.log('getting data');
    fetch('http://localhost:8080/api/schemes')
      .then(response => response.json())
      .then(data => {
        setData(Array.from(data))
      })
      .catch(error => console.error(error));
  }, []);

  if (!localStorage.getItem('isLoggedIn'))
    navigate('/login')
  else
    return (
      <>
        <nav className='px-8'>
          <div className="nav-heading align-self-center text-xl font-medium">
            <h1>Farmer Scheme Hub</h1>
          </div>
          <div className="right align-self-center">
            <ul>
              <li>
                <button
                  className="bg-black hover:bg-gray-800 text-white rounded-full px-4 py-2 text-md"
                  onClick={logout}
                >
                  Logout
                </button>
              </li>
            </ul>
          </div>
        </nav>
        <div className="photo">
          <div className="left">
            <h1>Emerging <br /> Innovation</h1>
            <h2>Empowering Farmers, <br /> One scheme at a time</h2>
          </div>
        </div>

        <section className="content ">
          <h3 className='my-4'>Schemes For Farmers</h3>
          <div className='h-[70vh] overflow-y-scroll max-w-[950px] m-auto'>
            <ul>
              {data.map(item => (
                <div className='p-2 border-[1px] m-2 border-gray-300 rounded-md hover:bg-gray-100'
                  key={item.id}
                  onClick={() => viewSchemeDetails(item.id)}
                >
                  <li>{item.title}</li>
                </div>
              ))}
            </ul>
          </div>
        </section>
        <div className="footer flex justify-center items-center">
          <h4 className='p-3'>©2023 All rights reserved</h4>
        </div>
      </>
    );
}
