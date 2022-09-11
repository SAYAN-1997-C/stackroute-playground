var funall=require('../samplescript/funcoll')
var expect=require('chai').expect
var should=require('chai').should()

describe("checking collection ",()=>{

    it('test collection',()=>{

 let booklist={"bookname":"asp","author":"wincent"};
  let resultcoll=funall.loadBooks(booklist);

  resultcoll.should.have.property("author");

  });
it("collection value test",()=>
{

    let booklist={"bookname":"asp","author":"wincent"};
    let resultcoll=funall.loadBooks(booklist);
  
    resultcoll.should.have.property("author").equals("wincent");
  

})

it('should return value for key',()=>{

    let booklist={"bookname":"asp","author":"wincent"};

var ans=    funall.searchBook(booklist,"bookname");
expect(ans).equal("asp")
})




})