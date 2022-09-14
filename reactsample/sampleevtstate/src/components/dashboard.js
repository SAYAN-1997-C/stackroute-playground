import React from 'react'
import Cardchild from './cardchild';
import './mystyle.css'


class Dashboard extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {message:"welcome", datareceived:""}
   this.handleMyEvent=this.handleMyEvent.bind(this);

    }

    handleMyEvent(eventdata)
    {
     console.log("Parent receiving data  : " + eventdata);
     this.setState({datareceived:eventdata});
    }

    render()
    {
return(
<div className="clsdash">
    <h1> Dashboard</h1>
    
     <h6> Data received from Card Child is :  {this.state.datareceived} </h6>
    
    {/* <h5> {this.state.message}</h5> */}
    <input type="text" value={this.state.message} onChange={ (evt)=> this.setState( {message:evt.target.value})}/>
    <Cardchild data={this.state.message} onCardClick={this.handleMyEvent} />

    {/* <input type="text" value={this.state.message} onChange={this.handleMyEvent} /> */}


   
<h5> End!!!!!!!</h5>


</div>

)

    }
}

export default Dashboard;