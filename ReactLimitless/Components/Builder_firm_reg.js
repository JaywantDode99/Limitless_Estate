import { useReducer,useState,useEffect } from "react";
import { useNavigate } from "react-router-dom";



export default function Builder_firm_reg(){

    const init =  {

        firm_name:"",
        reg_no:"",        
        login_id : "" 
        
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
   
    const sendData=(e)=>{
        e.preventDefault();
        const reqOptions = {
            method: 'POST',
            headers: {'Content-Type':'application/json'},
            body: JSON.stringify(info)
        }
    
        fetch("http://localhost:8080/savebuilderreg",reqOptions)
        .then((resp) => {
            if(resp.ok)
            {
                alert("Firm registered Successfully")
                navigate("/marketingmgrHome");
            }  
            else  {
              alert("Firm registeration  unsuccessful")
                navigate("/builderfirmreg");
            }                  
        });
    }

    useEffect(() => {

      // fetch('http://localhost:8080/getbyUserid?id='+loginid)
      // .then((res) => res.json())
      // .then(obj =>{
      //       localStorage.setItem("loggedBuilder",JSON.stringify(obj))
      //   setBuilder(obj);
      // })


      fetch("http://localhost:8080/allBuilderreg")
      .then(resp => {

        if(resp.ok)
        {
          localStorage.setItem("loggedBuilder",JSON.stringify(resp))
        }
        
    })
  },[]);
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
              <label>Firm Name</label>
              <input
                type="text"
                id="firm_name"
                name="firm_name"
                className="form-control mt-1"
                placeholder="firm Name"
                value={info.bb_name}
                onChange={(e) => { dispatch({ type: 'update', fld: 'firm_name', val: e.target.value }) }}
                />
            </div>

            <div className="form-group mt-3">
              <label>Registration No</label>
              <input
                type="number"
                id="reg_no"
                name="reg_no"
                className="form-control mt-1"
                placeholder="Registration No"
                value={info.reg_no}
                onChange={(e) => { dispatch({ type: 'update', fld: 'reg_no', val: e.target.value }) }}
              />
            </div>

            <div className="form-group mt-3">
              <label>Login Id</label>
              <input
                type="number"
                id="login_id"
                name="login_id"
                className="form-control mt-1"
                placeholder="Login Id"
                value={info.login_id}
                onChange={(e) => { dispatch({ type: 'update', fld: 'login_id', val: e.target.value }) }}
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
    
