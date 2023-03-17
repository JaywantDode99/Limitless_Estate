


import { useReducer,useState,useEffect } from "react";
import { useNavigate } from "react-router-dom";


export default function Add_projectsDetails(){

    const init =  {
        building_name:"",
        total_flats:"",
        type_id:0 ,
        project_id:""

        // first_name:"",
        // last_name:"",
        // mobile_no:"",
        // email_id:"",
        // password:"",  
        // role_id:2,     
        // house_no:"",
        // building_name:"",
        // area:"",
        // city:"",
        // pincode:"",
        // forget_pwd_que_id:0,
       
        // answer:""
    }

    const reducer = (state,action) => {
        //console.log(state);
        switch(action.type){
            case 'update' : {
                 return { ...state,[action.fld]:action.val}  
            }
            case 'reset' : {
                return init;
            }
        }
    }
    
   

    const [info,dispatch] =useReducer(reducer,init);
    const [msg,setMsg]=useState("");
    const navigate=useNavigate();
    const [pd,setAllpd]=useState([]);


    useEffect(() => {
        
        //var roleSel = document.getElementById('roletype');
        //var queSel1 = document.getElementById('sourcetype');

       //console.log("hello");
    
        // fetch('http://localhost:8080/selectedRoles')
        //   .then((res) => res.json())
        //   .then((res) => {
        //     res.map((q) => {
        //         var opt1 = document.createElement('option');
        //         opt1.value = q.role_id;
        //         opt1.textContent = q.role_name;  
                
        //         roleSel.appendChild(opt1);
        //     });
        //   });

        fetch('http://localhost:8080/allProjectDetails')
          .then((res) => res.json())
          .then((pd) => setAllpd(pd));


          // fetch('http://localhost:8080/allSource')
          // .then((res) => res.json())
          // .then((res) => {
          //   res.map((q) => {
          //     var opt2 = document.createElement('option');
          //     opt2.value = q.source_id;
          //     opt2.textContent = q.source_type;
          //     queSel1.appendChild(opt2);
          //   });
          // });

      }, []);


    const sendData=(e)=>{
        e.preventDefault();
        const reqOptions = {
            method: 'POST',
            headers: {'Content-Type':'application/json'},
            body: JSON.stringify(info)
        }
    
        fetch("http://localhost:8080/saveprojectdetails",reqOptions)
        .then(resp => {
            if(resp.ok)
            {
                alert("registration Successfull")
                navigate("/marketingmgrHome");
            }
            
        });
    }
        
    return(
        
        <div className="Auth-form-container">
          <br/> <br/> <br/> <br/> <br/> <br/> <br/>
            <br/> <br/> <br/> <br/> <br/> <br/> <br/>
            <br/> <br/> <br/> <br/> <br/> <br/> <br/>  
        <form className="Auth-form">
          <div className="Auth-form-content">
          <br/> <br/> <br/> <br/> <br/> <br/> <br/>
            <br/> <br/> <br/> <br/> <br/> <br/> <br/>
            <br/> <br/> <br/> <br/> <br/> <br/> <br/>  
            
            <h3 className="Auth-form-title">Project Details </h3>
            <div className="form-group mt-3">
              <label>Building Name </label>
              <input
                type="text"
                id="building_name"
                name="building_name"
                className="form-control mt-1"
                placeholder="Building Name"
                value={info.bb_name}
                onChange={(e) => { dispatch({ type: 'update', fld: 'building_name', val: e.target.value }) }}
                />
            </div>
            <div className="form-group mt-3">
              <label>Total Flats</label>
              <input
                type="number"
                id="total_flats"
                name="total_flats"
                className="form-control mt-1"
                placeholder="Total flats"
                value={info.bb_regno}
                onChange={(e) => { dispatch({ type: 'update', fld: 'total_flats', val: e.target.value }) }}
                />
            </div>

            <div className="form-group mt-3">
          <label htmlFor='roletype'>Flat Types</label>
          <select name='type_id' id='type_id' required className='form-select'
            onChange={(e) => {dispatch({type: 'update',fld: 'type_id',val: e.target.value,}) }}>
            <option defaultValue={''}>select Flat type...</option>
            <option value='1'>Full-Furnished</option>
            <option value='2'>Semi--Furnished</option>
            <option value='3'>Non-Furnished</option>

          </select>
        </div>

            <div className="d-grid gap-2 mt-3">
              <button type="submit" className="btn btn-primary" onClick={(e) => { sendData(e) }} >
                Register
              </button>
              <button type="reset" className="btn btn-primary" onClick={() => { dispatch({ type: 'reset' }) }} >
                Clear
              </button>
            </div>
            <p>{JSON.stringify(info)}</p>
            <p>{msg}</p>
           </div>
        </form>
       
      </div>
        );




// <p>{msg}</p>
//         </div>
//     )
}


