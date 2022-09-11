var fun1=require('../samplescript/funsum');
var assert=require("assert")
var expect =require('chai').expect;

describe( "testing sum" , ()=>{
//test case1
it('add number positive',()=>{

let ans=fun1(12,2);
assert.equal(14, ans);

}); // it closed 


//test case2

it("add number negative testing",()=>{

let ans2=fun1(-10,-4);

//assert.equal(-1, ans2);


expect(ans2).to.equal(-1);


});




}) // describe closed