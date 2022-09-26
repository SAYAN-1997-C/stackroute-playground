import { render, screen } from '@testing-library/react';
import App from './App';
 

import Adapter from 'enzyme-adapter-react-16'

import Enzyme, {shallow} from 'enzyme'


Enzyme.configure({adapter:new Adapter()})

// test('renders learn react link', () => {
//   render(<App />);
//   const linkElement = screen.getByText(/learn react/i);
//   expect(linkElement).toBeInTheDocument();
// });


test('checkapp' , ()=>{
  const wrap=shallow(<App/>)
  expect(wrap.find("h1").text()).toContain("Welcome")


})