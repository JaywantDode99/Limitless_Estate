import { useReducer,useState,useEffect } from "react";
import { useNavigate } from "react-router-dom";

export default function BuildingDetails(){

    const init =  {
        category_id:0,
        total_flats:0,
        price:0,
        project_details_id:""
        //first_name:"",
        // last_name:"",
        // mobile_no:"",
        // email_id:"",
        // password:"",
        // role_id:"",
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
    const [que,setAllque]=useState([]);



    useEffect(() => {
        
        //var roleSel = document.getElementById('roletype');
        var queSel1 = document.getElementById('sourcetype');

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

        fetch('http://localhost:8080/allQue')
          .then((res) => res.json())
          .then((que) => setAllque(que));


          fetch('http://localhost:8080/allSource')
          .then((res) => res.json())
          .then((res) => {
            res.map((q) => {
              var opt2 = document.createElement('option');
              opt2.value = q.source_id;
              opt2.textContent = q.source_type;
              queSel1.appendChild(opt2);
            });
          });

      }, []);


    const sendData=(e)=>{
        e.preventDefault();
        const reqOptions = {
            method: 'POST',
            headers: {'Content-Type':'application/json'},
            body: JSON.stringify(info)
        }
    
        fetch("http://localhost:8080/savealluser",reqOptions)
        .then(resp => {if(resp.ok)
            {
                alert("registration Successfull")
                navigate("/login");
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
            
            <h3 className="Auth-form-title">Building Details</h3>
            
            <div className="form-group mt-3">
          <label htmlFor='roletype'>Select Building Category</label>
          <select name='category_id'id='category_id'required className='form-select'
            onChange={(e) => {dispatch({type: 'update',fld: 'category_id',val: e.target.value,}) }}>
            <option defaultValue={''}>select role...</option>
            <option value='1'>1-BHK</option>
            <option value='2'>2-BHK</option>
            <option value='3'>3-BHK</option>
            <option value='4'>4-BHK</option>
            <option value='5'>Row-Houses</option>
          </select>
        </div>


            <div className="form-group mt-3">
              <label>Total Flats</label>
              <input
                type="number"
                id="total_flats"
                name="total_flats"
                className="form-control mt-1"
                placeholder="Total Flats"
                value={info.bb_regno}
                onChange={(e) => { dispatch({ type: 'update', fld: 'total_flats', val: e.target.value }) }}
                />
            </div>
            <div className="form-group mt-3">
              <label>Price</label>
              <input
                type="number"
                id="price"
                name="price"
                className="form-control mt-1"
                placeholder="Price"
                value={info.email}
                onChange={(e) => { dispatch({ type: 'update', fld: 'price', val: e.target.value }) }}
              />
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


