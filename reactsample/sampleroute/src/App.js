 import { BrowserRouter , Route, Routes } from 'react-router-dom';
 import Home from './components/home';
 import About from './components/about';
 import Login from './components/login';
import './App.css';
import Header from './components/header';
import Dashboard from './components/dashboard';
import Notfound from './components/notfound';

function App() {
  return (
     <div>
      <BrowserRouter>
        <Header/>
         <Routes>
              <Route exact path="/" element={<Home/>}></Route>
              <Route exact path="/about" element={<About/>}> </Route>
              <Route exact path="/login" element={<Login/>}> </Route>
              <Route exact path="/dashboard" element={<Dashboard/>}> </Route>
              <Route path="*" element={<Notfound/>}></Route>
         </Routes>
      
      
      
      
      
      
      </BrowserRouter>




     </div>
  );
}

export default App;
