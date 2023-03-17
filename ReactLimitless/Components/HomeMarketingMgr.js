import {Link} from 'react-router-dom';
import { useEffect, useState } from 'react';

export default function HomeMarketingMgr()
{


  const [mgr,setManager]=useState(null);
  useEffect(() => {
        
   const loginid= JSON.parse(localStorage.getItem("loggedUser")).login_id;
 
   

    fetch('http://localhost:8080/getbyUserid?id='+loginid)
      .then((res) => res.json())
      .then(obj =>{
            localStorage.setItem("loggedManager",JSON.stringify(obj))
            setManager(obj);
      })
  },[]);
    return(
        <div>

        <h1 className='bg-primary text-black' > Welcome Marketing Manager {mgr && mgr.first_name} {mgr && mgr.last_name}</h1>

        <nav className="navbar navbar-expand-sm bg-light">
        <div className="container-fluid">
        <ul className="navbar-nav">
            <li className="nav-item">
              <Link to="/builderreg" className='nav-link px-3'>  Builder Registration </Link> 
            </li>
          

            <li className="nav-item">
              <Link to="/logout" className='nav-link px-3'> Logout </Link> 
            </li>

          </ul>
        </div>
      </nav>
      </div> 
    );

}   
 
