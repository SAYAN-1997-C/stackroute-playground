import  './newscard.css'
 
import { useEffect,useState } from "react"

export default function Newscard(props)
{
  const[content,setContent]=useState('');
  const[author,setAuthor]=useState('');
  const[urlimg,setUrlimg]=useState('');
  const[id,setId]=useState('');

  useEffect(()=>{
  setId(props.url);
  setContent(props.content);
  setAuthor(props.author);
  setUrlimg(props.urlimg);
  },[])
  

  const storeData = ()=>
   {
 
    const datatoadd = {
                    id,
                    content,
                    author,
                    urlimg
                }
               
        props.addNewsHandler(datatoadd);

 
   }

    return(

    <div className="clsnews">
  
      <h6>   {content}</h6>   
    <h6>        {author}</h6> 
    <div>
            <img src={urlimg} alt="noimage"></img>
<button onClick={storeData}>Save for Later</button>
            </div>  
    </div>


    )



}