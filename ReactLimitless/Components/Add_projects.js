import { useReducer,useState,useEffect } from "react";
import { useNavigate } from "react-router-dom";

export default function BuilderRegistration(){

    const init =  {
        builder_id : JSON.parse(localStorage.getItem("loggedBuilder")).builder_id,
        project_name:"",        
        contact_no:"", 
        rera_no:"",
        total_buildings:"",   
        total_flats:"",
        start_date:"",
        end_date:"",
        house_no:"",
        building_name:"",
        area:"",
        city:"",
        pincode:""
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

    // const [builder,setBuilder]=useState(null);
    // useEffect(() => {
          
    //  const loginid= JSON.parse(localStorage.getItem("loggedBuilder")).login_id;
   
    //   fetch('http://localhost:8080/getbyUserid?id='+loginid)
    //     .then((res) => res.json())
    //     .then(obj =>{
    //           localStorage.setItem("loggedBuilder",JSON.stringify(obj))
    //       setBuilder(obj);
    //     })
  
    // },[]);

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

        fetch('http://localhost:8080/allProjects')
          .then((res) => res.json())
          .then((que) => setAllque(que));


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
    
        fetch("http://localhost:8080/saveprojects",reqOptions)
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
            
            <h3 className="Auth-form-title">Registeration</h3>
            <div className="form-group mt-3">
              <label>Project Name</label>
              <input
                type="text"
                id="project_name"
                name="project_name"
                className="form-control mt-1"
                placeholder="Project Name"
                value={info.project_name}
                onChange={(e) => { dispatch({ type: 'update', fld: 'project_name', val: e.target.value }) }}
                />
            </div>
           
            <div className="form-group mt-3">
              <label>Contact No</label>
              <input
                type="number"
                id="contact_no"
                name="contact_no"
                className="form-control mt-1"
                placeholder="Contact No"
                value={info.contact_no}
                onChange={(e) => { dispatch({ type: 'update', fld: 'contact_no', val: e.target.value }) }}
              />
            </div>

            <div className="form-group mt-3">
              <label>Rera No.</label>
              <input
                type="number"
                id="rera_no"
                name="rera_no"
                className="form-control mt-1"
                placeholder="Rera No."
                value={info.rera_no}
                onChange={(e) => { dispatch({ type: 'update', fld: 'rera_no', val: e.target.value }) }}
              />
            </div>

            <div className="form-group mt-3">
            <label>Total Buildings</label>
            <input
              type="number"
              id="total_buildings"
              name="total_buildings"
              className="form-control mt-1"
              placeholder="Total Buildings"
              value={info.total_buildings}
              onChange={(e) => { dispatch({ type: 'update', fld: 'total_buildings', val: e.target.value }) }}
            />
          </div>

           
            <div className="form-group mt-3">
              <label>Total Flats</label>
              <input
                type="number"
                id="total_flats"
                name="total_flats"
                className="form-control mt-1"
                placeholder="Enter total flats"
                value={info.total_flats}
                onChange={(e) => { dispatch({ type: 'update', fld: 'total_flats', val: e.target.value }) }} />
            </div>

            <div className="form-group mt-3">
              <label>Start Date</label>
              <input
                type="date"
                id="start_date"
                name="start_date"
                className="form-control mt-1"
                placeholder="Start Date"
                value={info.start_date}
                onChange={(e) => { dispatch({ type: 'update', fld: 'start_date', val: e.target.value }) }} />
            </div>


            <div className="form-group mt-3">
              <label>End Date</label>
              <input
                type="date"
                id="end_date"
                name="end_date"
                className="form-control mt-1"
                placeholder="End Date"
                value={info.end_date}
                onChange={(e) => { dispatch({ type: 'update', fld: 'end_date', val: e.target.value }) }} />
            </div>

            <div className="form-group mt-3">
              <label>Project House No.</label>
              <input
                type="text"
                id="house_no"
                name="house_no"
                className="form-control mt-1"
                placeholder="House No."
                value={info.house_no}
                onChange={(e) => { dispatch({ type: 'update', fld: 'house_no', val: e.target.value }) }}
                />
            </div>
            <div className="form-group mt-3">
              <label> Project Building Name </label>
              <input
                type="text"
                id="building_name"
                name="building_name"
                className="form-control mt-1"
                placeholder="Building Name"
                value={info.building_name}
                onChange={(e) => { dispatch({ type: 'update', fld: 'building_name', val: e.target.value }) }}
                />
            </div>

            <div className="form-group mt-3">
            <label>Project Area</label>
            <input
              type="text"
              id="area"
              name="area"
              className="form-control mt-1"
              placeholder="Area"
              value={info.area}
              onChange={(e) => { dispatch({ type: 'update', fld: 'area', val: e.target.value }) }}
              />
          </div>



            <div className="form-group mt-3">
              <label>City</label>
              <input
                type="text"
                id="city"
                name="city"
                className="form-control mt-1"
                placeholder="Enter city"
                value={info.city}
                onChange={(e) => { dispatch({ type: 'update', fld: 'city', val: e.target.value }) }}
                />
            </div>
            <div className="form-group mt-3">
              <label>pincode</label>
              <input
                type="number"
                id="pincode"
                name="pincode"
                className="form-control mt-1"
                placeholder="Enter pincode"
                value={info.pincode}
                onChange={(e) => { dispatch({ type: 'update', fld: 'pincode', val: e.target.value }) }}/>
            </div>

        {/* <div className="form-group mt-3">
          <label htmlFor='securityque'>Select security question</label>
          <select className='form-select' id='securityque' required  name='securityque'
                 onChange={ (e)=> {dispatch({type:'update',fld:'forget_pwd_que_id',val:e.target.value})}}>
           <option defaultValue={''}>Choose...</option>
           {
                que.map(q => {
                    return <option value={q.forget_pwd_que_id} > {q.question} </option>
                })
           }
            
          </select>
        </div> */}

        {/* <div className="form-group mt-3" >
          <label className="form-label" htmlFor="question">Answer</label>
            <input type="text" id="answer" className="form-control" required name="answer" value={info.answer}
                    onChange={ (e)=> {dispatch({type:'update',fld:'answer',val:e.target.value})}}/>
          </div> */}

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


