 import Lifecyclesample from './components/Lifecyc';
import './App.css';
import React from "react";
import Studentdashboard from './components/Studentdashboard';
import Login from './components/login';
import { BrowserRouter , Route, Routes } from 'react-router-dom';
function App() {
  return (
    <div className="App">
           
      <BrowserRouter>
      
         <Routes>
        
              <Route exact path="/login" element={<Login/>}> </Route>
              <Route exact path="/dashboard" element={<Studentdashboard/>}> </Route>
        
         </Routes>
      
      
      
      
      
      
      </BrowserRouter>

    </div>
  );
}

export default App;
