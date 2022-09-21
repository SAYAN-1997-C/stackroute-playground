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

function App() {
  return (
    <div className="App">
      {/* <Lifecyclesample message="thursday"/> */}


 <BrowserRouter>
      
      <Header/>
         <Routes>
            
              
              <Route exact path="/" element={<Login/>}> </Route>
              <Route exact path="/dashboard" element={<Studentdashboard/>}> </Route>
              <Route exact path="/addstudent" element={<Addstudent/>}></Route>
              <Route exact path="/card" element={<Studentcard/>}></Route>
              <Route exact path="/register" element={<Register/>}></Route>
         </Routes>
      
    </BrowserRouter>


    <Footer/>
 
    </div>
  );
}

export default App;
