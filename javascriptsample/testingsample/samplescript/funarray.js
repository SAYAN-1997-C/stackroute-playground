function funArray(fruitarr)
{
  let fruits=fruitarr;
let resularr=    fruits.filter( frt=> frt.startsWith("A") );
return resularr;

}


module.exports=funArray