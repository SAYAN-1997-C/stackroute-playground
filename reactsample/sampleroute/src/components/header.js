import {Link} from 'react-router-dom'

import './header.css';


export default function Header()
{

return(
        <div className="clshead">
           <h1> Stackroute.com </h1>
            {/* <a href="/"> Home </a>
            <a href='/about'>About </a>
            <a href='/login'> Login </a>  */}

            <ul>
                <li>
                    <Link to="/">Home </Link>
                </li>
                <li>
                    <Link to="/about">About</Link>
                </li>
               <li>
                    <Link to="/login">Login</Link>
                </li>

                <li>
                    <Link to="/abc"> My DOCs</Link>

                </li>

            </ul>


        </div>

)


}