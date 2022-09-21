
  import TextField from '@material-ui/core/TextField';
  import { makeStyles } from '@material-ui/core/styles';
import { findByLabelText } from '@testing-library/react';
import './register.css';

export default function Register(props)
{

    const useStyles = makeStyles((theme) => ({
        root: {
          '& .MuiTextField-root': {
            margin: theme.spacing(1),
            width: '25ch',
          },
        },
       
      }));
      
      const classes=useStyles()

return (
    <form className={classes.root} noValidate autoComplete="off">
    <div className='clsregister'>
      <TextField required id="standard-required" label="Required" defaultValue="Hello World" />
      <TextField disabled id="standard-disabled" label="Disabled" defaultValue="Hello World" />
      <TextField
          id="outlined-password-input"
          label="Password"
          type="password"
          autoComplete="current-password"
          variant="outlined"
        />
       </div>
       </form>

)

}