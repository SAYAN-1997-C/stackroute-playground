
import "./dashboard.css";
import Myservice from "./myservice";

export default function Dashboard(props)
{

    let serviceobj=new Myservice();

   // let name=localStorage.getItem("namekey");

   let name=sessionStorage.getItem("namekey");

  const handleEvt = ()=>
   {
        serviceobj.displayInfo();
   }

  return(
    <div className="clsdash">

    <h1> Dashboard </h1>

    <h3> Welcome {name} </h3>
    <button onClick={handleEvt}>Click </button>

    </div>


  )

}