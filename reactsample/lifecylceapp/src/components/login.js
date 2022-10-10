
// import { Button } from '@material-ui/core';
import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import React from "react";

export default function Login()
{

    const [name,setName] = useState("");
    const [password,setPassword] = useState("");


    let navigate = useNavigate();

    const forwardEvt =()=>
    {
        navigate(-1);
    }
    const handleEvent = () =>
    {
       // localStorage.setItem("namekey", name);
       if(name==="admin" && password==="pass@123" )
       {
          sessionStorage.setItem("loggedin", true);
          navigate("/dashboard");
       }
       else
       sessionStorage.clear();

    }

return (

    <div>
        <h1> Login Form </h1>

        <input type="text" value={name} onChange={(evt)=>setName(evt.target.value)}/>
        <input type="text" value={password} onChange={(evt)=>setPassword(evt.target.value)}/>
        <div>
       
        <button onClick={forwardEvt}> Back </button>

        <button variant="contained" color="secondary" onClick={handleEvent}>
            Login </button>
 
        </div>
    </div>


)


}