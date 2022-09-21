import { useState } from "react";
import './addstud.css';
import React from 'react';
import Button from '@material-ui/core/Button';
import Snackbar from '@material-ui/core/Snackbar';
import MuiAlert from '@material-ui/lab/Alert';
import { makeStyles } from '@material-ui/core/styles';
import Alert from "./alert";


export default function Addstudent(props)
{


    

  const useStyles = makeStyles((theme) => ({
    root: {
      width: '100%',
      '& > * + *': {
        marginTop: theme.spacing(2),
      },
    },
  }));
  
 
    const[id,setStudentid]=useState('');
    const[name,setName]=useState('');
    const[subject,setSubject]=useState('');

  const saveUser=( (e)=>
  {
    e.preventDefault();
     const userdata={
         id,
         name,
         subject
     };
     console.log(userdata);
    setOpen(true);
     props.addStudentEvt(userdata);
      
  })

  const classes = useStyles();
  const [open, setOpen] = React.useState(false);

  const handleClick = (e) => {
    e.preventDefault();
    setOpen(true);
  };

  const handleClose = (event, reason) => {
    setOpen(false);
    if (reason === 'clickaway') {
      return;
    }
  }


    return(
       
   <div className="clsadd">
     <h5> Student REgistration </h5>
<form className="clsform" onSubmit={ (evt)=>saveUser(evt)}>
  
  <input type="text"   defaultValue={id} placeholder="enter id" onChange={ (evt)=> setStudentid(evt.target.value)}/>
  
  <input type="text"  defaultValue={name} placeholder="enter name"  onChange={ (evt)=> setName(evt.target.value)}/>
  
  <input type="text"   defaultValue={subject} placeholder="enter subject"  onChange={ (evt)=> setSubject(evt.target.value)}/>
  
  <button type="submit">submit</button>

  <Button variant="outlined" onClick={handleClick}>
        click
      </Button>

  <Snackbar open={open} autoHideDuration={6000} onClose={handleClose}>
        <Alert onClose={handleClose} severity="success">
              Student Record Addedd Successfully
        </Alert>
      </Snackbar>

      {/* <Alert severity="success">This is a success message!</Alert> */}


</form>




   </div>




    );
    }