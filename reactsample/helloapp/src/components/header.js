import Child from "./child";

function  Header(props){
return (
  <div className="clsdisp">
<h3> React World ... New JavaScript Enhancer !!!!!!!!!!!! </h3>
{props.text}
    <Child/>
  </div>


)


}

export default Header;