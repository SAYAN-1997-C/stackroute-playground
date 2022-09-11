var myfunarr=require("../samplescript/funarray");
var assert=require('assert')
var expect=require('chai').expect;
var should=require('chai').should()

describe("check array functions" , ()=>{

    it( 'should return fruit with A',()=>{
let data=["Apple","banana","Mango"];
let result= myfunarr(data)
// assert.equal("Apple",result[0])

result.should.have.lengthOf(1);

    })



});