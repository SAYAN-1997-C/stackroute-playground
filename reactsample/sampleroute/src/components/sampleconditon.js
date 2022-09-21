import { useRef } from "react"

export default function Samplecondition()
{
const fruits=[]
const mydata=useRef(null);

const getData = ()=>
{
 alert(mydata.current.value)
}

return (
   <div>
      { fruits && fruits.length>0 && 
         <div>
                <h3>Number of fruits are {fruits.length} </h3>
                {
                    fruits.map ( (fobj)=>
                        <h5>{fobj} </h5>
                    )
                }
            </div>
       }

<input type="text" ref={mydata}></input>
<button onClick={getData}>Display</button>

   </div>


)


}