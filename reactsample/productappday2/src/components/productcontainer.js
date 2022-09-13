import React from "react";
import Productcart from "./productcart";
import "./productcontainer.css"

class Productcontainer extends React.Component
{

  products=[{"pname":"Laptop","company":"DELL"}, 
                    {"pname":"TV","company":"Samsung"},
                    {"pname":"AC","company":"Bluestar"},
                    {"pname":"WMachine","company":"Whirlpool"},
                    {"pname":"Jeans","company":"Raymond"}

                    ];


     render()
     {
  return(
    <div>
       <h1> Product Cart Details </h1>
    {/* <div className="mycontainer">
       <Productcart pname="Laptop"/>
       <Productcart pname="Mobile"/>
       <Productcart pname="TV"/>

    </div> */}
    
      <div className="mycontainer">
        {
      this.products.map(   (prod)=>
                                    // <Productcart key={prod.pname} pname={prod.pname} company={prod.company}/>
      //spread operator (...) expands the collection like  pname:Laptop company:DELL
  <Productcart {...prod}/>

      ) }
      </div>
    
     



 </div>
  );

     }
}

export default Productcontainer;