import logo from './logo.svg';
import './App.css';
import Productcontainer from './components/productcontainer';
import Header from './components/header';
import Footer from './components/footer';

function App() {
  return (
    <div className="App">
     <Header/>
     <Productcontainer/>

     <div className='footer'>
     <Footer/>
     </div>

    </div>
  );
}

export default App;
