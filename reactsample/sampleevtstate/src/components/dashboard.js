import React from 'react'
import Cardchild from './cardchild';
import './mystyle.css'


class Dashboard extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {message:"welcome"}
   this.handleMyEvent=this.handleMyEvent.bind(this);

    }

    handleMyEvent(event)
    {
        this.setState( {message : event.target.value} );

        console.log("text entered ");
    }

    render()
    {
return(
<div class="clsdash">

    <h1> Dashboard</h1>

    <h5> {this.state.message}</h5>
   
    <Cardchild data={this.state.message} />

    <input type="text" value={this.state.message} onChange={this.handleMyEvent} />


</div>

)

    }
}

export default Dashboard;