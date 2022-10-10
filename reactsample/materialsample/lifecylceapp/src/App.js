 import Lifecyclesample from './components/Lifecyc';
import './App.css';
import Studentdashboard from './components/Studentdashboard';
import { BrowserRouter , Route, Routes } from 'react-router-dom';
import Addstudent from './components/addstudent';
import Studentcard from './components/studentcard';
import Login from './components/login';
import Header from './components/header';
import Footer from './components/footer';
import Register from './components/register';
import Home from './components/home';
import PrivateRoute from './privateroute';
import Newsdashboard from './components/newsdashboard';
function App() {
  return (
  //   <div className="App">
 

  //   { <Login/>}


  //   <Footer/>
 
  //   </div>
  // );



//  { 
  
  <BrowserRouter>
      
      <Header/>
         <Routes>
            
              <Route exact path='/' element={<Home/>}> </Route>
              <Route exact path="/login" element={<Login/>}> </Route>
          
              <Route exact path="/addstudent" element={
                                                      <PrivateRoute>
                                                             <Addstudent/>
                                                      </PrivateRoute>

                                                      }></Route>
              <Route exact path="/card" element={<Studentcard/>}></Route>
              <Route exact path="/register" element={<Register/>}></Route>
               
               <Route exact path="/dashboard" element={
                                                      <PrivateRoute>
                                                             <Studentdashboard/>
                                                      </PrivateRoute>

                                                      }>
                </Route>                                 
  
         </Routes>
      
    </BrowserRouter>
    
  
  // }

  )

}

export default App;
