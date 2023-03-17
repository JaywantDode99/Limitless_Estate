import { useReducer,useState,useEffect } from "react";

export default function Approve_builder()
{
//   const [admin,setAdmin]=useState(null);
//   useEffect(() => {
        
//    const loginid= JSON.parse(localStorage.getItem("loggedUser")).login_id;
 
   

//     fetch('http://localhost:8080/getbyUserid?id='+loginid)
//       .then((res) => res.json())
//       .then(obj =>{
//             localStorage.setItem("loggedAdmin",JSON.stringify(obj))
//         setAdmin(obj);
//       })
//   },[]);
// useEffect(() => {
        
    
//     var queSel1 = document.getElementById('builderstatus');


// fetch('http://localhost:8080/allbuilder')
// .then((res) => res.json())
// .then((res) => {
//   res.map((q) => {
//     var opt2 = document.createElement('option');
//     opt2.value = q.source_id;
//     opt2.textContent = q.source_type;
//     queSel1.appendChild(opt2);
//   });
// });

// }, []);



    return(
        <div> 

        <h1 className='bg-primary text-black' > Approve your builders  </h1>
        <table>
            <tr>
            <div className="form-group mt-3">
          <label htmlFor='builderstatus'>Select Source</label>
          {/* <select
            name='builderstatus'
            id='builderstatus'
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
          </select> */}
        </div>
            </tr>

        </table>
        
      </div>
    );

}   
 