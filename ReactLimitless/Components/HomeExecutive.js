import { useEffect, useState } from 'react';

export default function HomeExecutive()
{

    const [executive,setExecutive]=useState(null);
    useEffect(() => {
          
     const loginid= JSON.parse(localStorage.getItem("loggedUser")).login_id;
   
     
  
      fetch('http://localhost:8080/getbyUserid?id='+loginid)
        .then((res) => res.json())
        .then(obj =>{
              localStorage.setItem("loggedExecutive",JSON.stringify(obj))
              setExecutive(obj);
        })
    },[]);
    return(
        <div>
            <h1>Welcome Executive {executive && executive.first_name} {executive && executive.last_name}</h1>

        
    </div> 
    );

}   
 
