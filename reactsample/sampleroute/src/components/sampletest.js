
import { useState } from "react"
export default function Sampletest(props)
{
    const[company,setCompany]=useState("")
return(
 <div>
       <h1>Welcome</h1>


       <div id="display">
        Topic is {props.topic}
       </div>
    
    <div id="clsid">
        Company:{company}
   </div>

   <button onClick={()=>setCompany("stackroute")}>Click</button>


 </div>




)

}