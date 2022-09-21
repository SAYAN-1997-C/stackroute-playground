import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import './card.css';
import { lightBlue } from '@material-ui/core/colors';

export default function Studentcard(props)
{

   const useStyles = makeStyles({
      root: {
        minWidth: 205,
         
      },
      bullet: {
        display: 'inline-block',
        margin: '0 2px',
        transform: 'scale(0.8)',
      },
      title: {
        fontSize: 14,
      },
      pos: {
        marginBottom: 12,
      },
    });

    const classes=useStyles();
const deleteStudent= (evt)=>
{
props.deleteItem(props.id)

} 


return(
<div>
   <Card className={classes.root}>
   <CardContent>
     <Typography className={classes.title} color="textSecondary" gutterBottom>
       {props.id}
     </Typography>
     <Typography variant="h5" component="h2">
       {props.name}
     </Typography>
     <Typography className={classes.pos} color="textSecondary">
      
     </Typography>
     <Typography variant="body2" component="p">
     {props.subject}
     </Typography>
   </CardContent>
   <CardActions>
     <Button color="secondary" size="small" onClick={deleteStudent}>Delete</Button>
   </CardActions>
 </Card>


 </div>






)


}