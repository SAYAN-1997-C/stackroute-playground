
import { Navigate } from "react-router-dom";

export default function PrivateRoute( {children} )
{

    let flag=false;
flag=sessionStorage.getItem("loggedin");
 
return flag ? children : <Navigate to="/login" /> ; 

}