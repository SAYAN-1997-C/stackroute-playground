import { useState } from 'react';
import './mystyle.css'


export default function Cardchild(props)
{

    // declared a state variable named userdata , with initial value to be dummy

   const[userdata, setUserdata]=useState("dummy");

    let mydata="abc";
  
    const changeVal = (e)=>{
            mydata="good day";
            setUserdata("have a great day");
            console.log(mydata);
    }

  const submitClick = (e) =>
  {
    props.onCardClick(userdata);
  }


    return(
    <div className="clscard">
          
          <h4> Card Display - Child </h4>

            {props.data}
          <h5>  Normal constant value  {mydata} </h5>
          <h5> State variable value {userdata} </h5>


 <input type="text" onChange={ (evt)=>   setUserdata(evt.target.value) } />

           {/* <h5> Value from Parent is {props.data} </h5> */}


           <button onClick={changeVal}>Check State</button>

           <button onClick={submitClick}>Submit</button>

    </div>



    )



}