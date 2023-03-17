import { useReducer,useState } from "react";
import { useNavigate } from "react-router-dom";
import { useDispatch } from "react-redux";
import './Login.css';
import { login } from "./slice";



export default function Login()
{

  let reduxAction = useDispatch();
    const init =  {
        email_id:"",
        password:""
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
   // const [isLoggedIn, setIsLoggedin] = useState(false);
    

    
    const sendData=(e)=>{
        e.preventDefault();
        const reqOptions = {
            method: 'POST',
            headers: {'Content-Type':'application/json'},
            body: JSON.stringify(info)
        }
        fetch("http://localhost:8080/checkLogin",reqOptions)
        .then(resp => {if(resp.ok)
            {
                console.log(resp.status);
                return resp.text();
            }
             else
             {
                
                console.log(resp.status);
                throw new Error("Server error");
             }
        })
        .then(text => text.length ? JSON.parse(text) :{})
        .then (obj => {
            if (Object.keys(obj).length===0)
            {
                console.log(Object.keys(obj).length);
                setMsg("Wrong userid/pwd");
            }
            else
            {
              reduxAction(login())
              localStorage.setItem("loggedUser",JSON.stringify(obj))
                if (obj.status===false)
                {
                    alert("request has not approved");
                    navigate ('/login');
                }
                else
                {
                    if (obj.role_id.role_id===1)
                    {
                        navigate("/adminHome");
                    }
                    else if (obj.role_id.role_id===2)
                    {
                        navigate("/builderHome");
                    }
                    else if (obj.role_id.role_id===3)
                    {
                        navigate("/marketingmgrHome");
                    }
                    else if (obj.role_id.role_id===4)
                    {
                        navigate("/executiveHome");
                    }
                    else if (obj.role_id.role_id===5)
                    {
                        navigate("/customerHome");
                    }
                    
                }
            }


        })
        .catch((error)=> alert("Server error. Try after some time"));
    }


  
  return (
    <div className="Auth-form-container">
      
      <form className="Auth-form">
        <div className="Auth-form-content">
          <h3 className="Auth-form-title">Sign In</h3>
          <div className="form-group mt-3">
            <label>Email address</label>
            <input
              type="email"
              id="email_id"
              name="email_id"
              className="form-control mt-1"
              placeholder="Enter email"
              value={info.email_id}
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
              value={info.password}
              onChange={(e) => { dispatch({ type: 'update', fld: 'password', val: e.target.value }) }}
            />
          </div>
          <div className="d-grid gap-2 mt-3">
            <button type="submit" className="btn btn-primary" onClick={(e) => { sendData(e) }}>
              Submit
            </button>
            <button type="reset" className="btn btn-primary" onClick={() => { dispatch({ type: 'reset' }) }}>
              Clear
            </button>
          </div>
          {/* <div className="d-grid gap-2 mt-3">
          </div> */}
          <p className="forgot-password text-right mt-2">
            Forgot <a href="#">password?</a>
          </p>
          <p>{JSON.stringify(info)}</p>
          <p>{msg}</p>
        </div>
      </form>
      <div>








      </div>
    </div>
  )
}