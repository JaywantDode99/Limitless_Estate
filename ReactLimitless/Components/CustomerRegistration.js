import { useReducer,useState,useEffect } from "react";
import { useNavigate } from "react-router-dom";
import './CustomerRegistration.css';
export default function CustomerRegistration(){

    const init =  {
        first_name:"",
        last_name:"",
        mobile_no:"",
        email_id:"",
        password:"",
        house_no:"",
        building_name:"",
        area:"",
        city:"",
        pincode:"",
        forget_pwd_que_id:0,
        role_id:5,
        answer:""
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

    const [mobileNumber, setMobileNumber] = useState('');
    const [isMobileValid, setIsMobileValid] = useState(false);

    const handleMobileNumberChange = (event) => {
        const newMobileNumber = event.target.value;
        setMobileNumber(newMobileNumber);

        const regex = /^\d{0,10}$/;
        const isMobileNumberValid = regex.test(newMobileNumber);
        setIsMobileValid(isMobileNumberValid);
  
    }


    useEffect(() => {
        
        var queSel = document.getElementById('securityque');
        var queSel1 = document.getElementById('sourcetype');

       //console.log("hello");
    
        // fetch('http://localhost:8080/allQue')
        //   .then((res) => res.json())
        //   .then((res) => {
        //     res.map((q) => {
        //       var opt1 = document.createElement('option');
        //       opt1.value = q.qid;
        //       opt1.textContent = q.question;
        //       queSel.appendChild(opt1);
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
    
        fetch("http://localhost:8080/saveuser",reqOptions)
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
            
            <h3 className="Auth-form-title">Registeration</h3>
            <div className="form-group mt-3">
              <label>First Name</label>
              <input
                type="text"
                id="first_name"
                name="first_name"
                className="form-control mt-1"
                placeholder="First Name"
                value={info.bb_name}
                onChange={(e) => { dispatch({ type: 'update', fld: 'first_name', val: e.target.value }) }}
                />
            </div>
            <div className="form-group mt-3">
              <label>Last Name</label>
              <input
                type="text"
                id="last_name"
                name="last_name"
                className="form-control mt-1"
                placeholder="Last Name"
                value={info.bb_regno}
                onChange={(e) => { dispatch({ type: 'update', fld: 'last_name', val: e.target.value }) }}
                />
            </div>
            <div className="form-group mt-3">
              <label>Mobile No</label>
              <input
                type="number"
                id="mobile_no"
                name="mobile_no"
                className="form-control mt-1"
                placeholder="Mobile no."
                value={info.email}
                onChange={(e) => { dispatch({ type: 'update', fld: 'mobile_no', val: e.target.value }) }}
              />
            </div>

            <div className="form-group mt-3">
            <label>Email address</label>
            <input
              type="email"
              id="email_id"
              name="email_id"
              className="form-control mt-1"
              placeholder="Enter email"
              value={info.uid}
              onChange={(e) => { dispatch({ type: 'update', fld: 'email_id', val: e.target.value }) }}
            />
          </div>

           
            <div className="form-group mt-3">
              <label>Password</label>
              <input
                type="password"
                id="password"
                name="password"
                className="form-control mt-1"
                placeholder="Enter password"
                value={info.pwd}
                onChange={(e) => { dispatch({ type: 'update', fld: 'password', val: e.target.value }) }}
                />
            </div>

            <div className="form-group mt-3">
              <label>House No.</label>
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
              <label>Building Name </label>
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
            <label>Area</label>
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
                onChange={(e) => { dispatch({ type: 'update', fld: 'pincode', val: e.target.value }) }}
                />
            </div>

            <div className="form-group mt-3">
          <label htmlFor='sourcetype'>Select Source</label>
          <select
            name='sourcetype'
            id='sourcetype'
            required
            className='form-select'
            onChange={(e) => {
              dispatch({
                type: 'update',
                fld: 'source_id',
                val: e.target.value,
              });
            }}
          >
            <option defaultValue={''}>Choose...</option>
          </select>
        </div>

        <div className="form-group mt-3">
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
        </div>

        <div className="form-group mt-3" >
          <label className="form-label" htmlFor="question">Answer</label>
            <input type="text" id="answer" className="form-control" required name="answer" value={info.answer}
                    onChange={ (e)=> {dispatch({type:'update',fld:'answer',val:e.target.value})}}/>
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


