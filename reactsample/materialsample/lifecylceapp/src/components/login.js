
import { Button } from '@material-ui/core';
import { useState } from 'react';
import { useNavigate } from 'react-router-dom';

export default function Login()
{

    const [name,setName] = useState("");


    let navigate = useNavigate();

    const forwardEvt =()=>
    {
        navigate(-1);
    }
    const handleEvent = () =>
    {
       // localStorage.setItem("namekey", name);
        sessionStorage.setItem("namekey", name);
         navigate("/dashboard");
    }

return (

    <div>
        <h1> Login Form </h1>

        <input type="text" value={name} onChange={(evt)=>setName(evt.target.value)}/>
  
        <div>
       
        <button onClick={forwardEvt}> Back </button>

        <Button variant="contained" color="secondary" onClick={handleEvent}>
            Login
</Button>
        </div>
    </div>


)


}