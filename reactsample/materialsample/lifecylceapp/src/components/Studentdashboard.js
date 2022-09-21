import axios from "axios"
import { useEffect,useState } from "react"
import Addstudent from "./addstudent";
import Studentcard from "./studentcard";
import './dashboard.css';
import Newscard from "./newscard";
import { Button } from "@material-ui/core";

 
import { makeStyles } from '@material-ui/core/styles';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';



export default function Studentdashboard()
{

    const useStyles = makeStyles({
        table: {
          minWidth: 650,
        },
      });


      const createData = (name, calories, fat, carbs, protein) =>{
        return { name, calories, fat, carbs, protein };
      }

      const rows = [
        createData('Frozen yoghurt', 159, 6.0, 24, 4.0),
        createData('Ice cream sandwich', 237, 9.0, 37, 4.3),
        createData('Eclair', 262, 16.0, 24, 6.0)
      ]
      const classes = useStyles();

    const[studentarr,setStudentarr]=useState([])

    // const[newsarr,setNewsarr] =useState([])

const addEventHandler= (data)=>
{
  axios.post('http://localhost:3005/student',data,
   {
    headers: {
        'Content-type': 'application/json'
    }
   })
   .then
   (
    res=>
        {
        setStudentarr([...studentarr,res.data]);
        }
   )
   .catch
   (
err=>console.log("error " + err)

   )
}


    const deleteEventhandler= (childid)=>
    {
axios.delete(`http://localhost:3005/student/${childid}`)
        .then
        (
            res=>
            {
               
                 if(res.status===200)
                 {
                    setStudentarr(studentarr.filter(stud=> stud.id !== childid))
                console.log("record deleted");
                console.log(res)
                 }
            }
        )
        .catch
         (
            err=>console.log("error " + err)
         )

    }

    useEffect(()=>{
 
    axios.get('http://localhost:3005/student')
    .then
    (
        (res)=>
        {
          
            console.log(res.data );
         setStudentarr(res.data);
             console.log(studentarr)
        }
    )
    .catch
    (
        (err)=>console.log("error occured " + err)
    )


                },[] );

    // ASSINGMENT sample
    //  axios.get('https://newsapi.org/v2/top-headlines?country=in&apikey=7f118af83e1b48f6939fc5096e89fd22&page=1')
    //         .then
    //         (
    //             (res)=>
    //             {
                  
    //                 console.log(res.data.articles);
    //              //   setStudentarr(res.data);
    //              setNewsarr(res.data.articles);
    //                 console.log(studentarr)
    //             }
    //         )
          


return(
<div>
 <div className="clsdashboard">
      <h4> Dashboard </h4>




  <div className="clsdisplay">

 <div>
    {

     studentarr.map(stud=>
<Studentcard key={stud.id} id={stud.id} name={stud["name"]} subject={stud.subject} deleteItem={deleteEventhandler}/>
        
        )


//   newsarr.map (news=>
//     <Newscard content={news.content} author={news.author} urlimg={news.urlToImage} />)


   }
</div>

<Addstudent addStudentEvt={addEventHandler}/>
</div>
 </div>

<TableContainer component={Paper}>
      <Table className={classes.table} aria-label="simple table">
        <TableHead>
          <TableRow>
            
            <TableCell align="right">id</TableCell>
            <TableCell align="right">name</TableCell>
            <TableCell align="right">subject</TableCell>
            
          </TableRow>
        </TableHead>
        <TableBody>
          {studentarr.map((row) => (
            <TableRow key={row.id}>
              <TableCell align="right">
                {row.id}
              </TableCell>
              <TableCell align="right">{row.name}</TableCell>
              <TableCell align="right">{row.subject}</TableCell>
              
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>








 </div>
)

}