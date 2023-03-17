import { useReducer,useEffect, useState } from 'react';
import { BrowserRouter,Routes,Route } from 'react-router-dom';
import { Link } from 'react-router-dom';


export default function HomeCustomer()
{
    
    
    const init =  {

        area:"",
        flat_category:""     
            
       }

       const reducer = (state,action) => {
        //console.log(state);
        switch(action.type)
        {
            case 'update' : {
                 return { ...state,[action.fld]:action.val}  
            }
            case 'reset' : {
                return init;
            }
        }


    }
    const [que,setAllque]=useState([]);

    const [info,dispatch] =useReducer(reducer,init);
    const [customer,setCustomer]=useState(null);
    const [project,setProject]=useState([]);

    useEffect(() => {
          
     const loginid= JSON.parse(localStorage.getItem("loggedUser")).login_id;
 
      fetch('http://localhost:8080/getbyUserid?id='+loginid)
        .then((res) => res.json())
        .then(obj =>{
              localStorage.setItem("loggedCustomer",JSON.stringify(obj))
              setCustomer(obj);
        })
    },[]);

    useEffect(() => {
        var userSel = document.getElementById('usertype');
        var queSel = document.getElementById('secque');
    
        fetch('http://localhost:8080/getusertypes')
          .then((res) => res.json())
          .then((res) => {
            // console.log(res);
    
            res.map((v) => {
              var opt = document.createElement('option');
              opt.value = v.ucatid;
              opt.textContent = v.cattype;
              userSel.appendChild(opt);
            });
          });
    
        fetch('http://localhost:8080/allProjects')
          .then((res) => res.json())
          .then((res) => {
            res.map((q) => {
              var opt1 = document.createElement('option');
              opt1.value = q.project_id;
              opt1.textContent = q.address_id.area;
              queSel.appendChild(opt1);
            });
          });
      }, []);

    // useEffect(() => {
    
    //      fetch('http://localhost:8080/allProjects')
    //        .then((res) => res.json())
    //        .then(obj =>{
    //              localStorage.setItem("projectdata",JSON.stringify(obj))
    //              setProject(obj);
    //        })
    //    },[]);



    return(
        <div>
            <h1>Welcome  {customer && customer.first_name} {customer && customer.last_name} </h1>


            <div className='mb-3 form-row'>
          <label htmlFor='secque'>Select security question</label>
          <select name='secque' id='secque' className='form-control form-control-sm'
            onChange={(e) => { dispatch({ type: 'register', field: e.target.name, val: e.target.value,});
            }} >
            <option defaultValue={''}>Choose...</option>
          </select>
        </div>
        

        
    </div> 
    );

}   
 
