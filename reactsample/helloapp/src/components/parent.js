import React from "react";
import Header  from "./header";

class Parent extends  React.Component
{
    render()
    {
       return (
          <div className="clsparent">
         
            <h1> This is Parent saying {this.props.message}</h1>
            <Header text="goodday"/>
             Parent Saying bye

            </div>
    );
    }
}
export default Parent;