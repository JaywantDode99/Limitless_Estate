import { useEffect, useState } from 'react';
import {Link} from 'react-router-dom';
export default function HomeBuilder()
{


  const [builder,setBuilder]=useState(null);
  useEffect(() => {
        
   const loginid= JSON.parse(localStorage.getItem("loggedUser")).login_id;
 
    fetch('http://localhost:8080/getbyUserid?id='+loginid)
      .then((res) => res.json())
      .then(obj =>{
            localStorage.setItem("loggedBuilder",JSON.stringify(obj))
        setBuilder(obj);
      })

  },[]);
    return(
        <div >

        <h1 className='bg-primary text-black' > Welcome Builder  {builder && builder.first_name} {builder && builder.last_name}  </h1>

        <nav className="navbar navbar-expand-sm bg-light">
        <div className="container-fluid">
        <ul className="navbar-nav">

          
            <li className="nav-item">
              <Link to="/Add_projects" className='nav-link px-3'>  Add Projects </Link> 
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
 
