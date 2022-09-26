import Sampletest from "./sampletest";

import Adapter from 'enzyme-adapter-react-16'

import Enzyme, {shallow} from 'enzyme'


Enzyme.configure({adapter:new Adapter()})

test('check if h1 contains text',()=>{
const wrap =shallow(<Sampletest/>)
expect(wrap.find('h1').text()).toContain("Welcome")
});


test('check the div content',()=>{
const wrap=shallow(<Sampletest topic="react"/>)
expect(wrap.find("#display").text()).toBe("Topic is react")

})


test('check state of comp',()=>{
const wrap=shallow(<Sampletest topic="JEST"/>)
expect(wrap.find("#clsid").text()).toBe("Company:")
})



test('check button click',()=>{

    const wrap=shallow(<Sampletest topic="testing"/>)

 wrap.find('button').simulate('click')
 

 expect (wrap.find("#clsid").text()).toBe("Company:stackroute")



})