import { useEffect, useState } from 'react';
import {Link} from 'react-router-dom';
import './HomeAdmin.css';
export default function HomeAdmin()
{
  const [admin,setAdmin]=useState(null);
  useEffect(() => {
        
   const loginid= JSON.parse(localStorage.getItem("loggedUser")).login_id;
 
   

    fetch('http://localhost:8080/getbyUserid?id='+loginid)
      .then((res) => res.json())
      .then(obj =>{
            localStorage.setItem("loggedAdmin",JSON.stringify(obj))
        setAdmin(obj);
      })
  },[]);

    return(
        <div> 

        {/* <h1 className='bg-primary text-black' > Welcome {admin && admin.first_name} {admin && admin.last_name}  </h1> */}

        <nav className="navbar navbar-expand-sm bg-light">
        <div className="container-fluid">
        <ul className="navbar-nav">
        <li className="nav-item">
      
            </li>
            <li className="nav-item">
              <Link to="/allreg" className='nav-link px-3'> Registration </Link> 
            </li>

            <li className="nav-item">
              <Link to="/Approve_builder" className='nav-link px-3'> Approve builder</Link> 
            </li>


          <li className="nav-item">
              <Link to="/logout" className='nav-link px-3'> Logout </Link> 
            </li>


            <Link to="#" className='nav-link px-3'> {admin && admin.first_name} {admin && admin.last_name}</Link> 
 
          </ul>
        </div>
      </nav>
      <h1> </h1>
      </div>
    );

}   
 
