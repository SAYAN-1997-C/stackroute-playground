import './mystyle.css'


export default function Cardchild(props)
{

    return(
    <div class="clscard">
          <h4> Card Display - Child </h4>
           <h5> Value from Parent is {props.data} </h5>
    </div>



    )



}