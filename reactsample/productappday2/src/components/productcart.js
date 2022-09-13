import './productcart.css';

export default function Productcart(props)
{
   return(
     <div className='divcard'>
            <div className="card" style={{"width": "18rem"}}>
  <div className="card-body">
  
    <h5 className="card-title">Product Data</h5>
    <h6 className="card-text">{props.pname}</h6>
    <p className="card-text">{props.company}</p>

  </div>
</div>




     </div>


   )


}