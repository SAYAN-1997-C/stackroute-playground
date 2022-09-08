 var userlist=  [
                  {
                    "name":"Sharma",
                    "age":40
                  },
                  {
                    "name":"Mithra",
                    "age":3
                  },
                  {
                    "name":"Jega",
                    "age":91
                  }
              ]



function display()
{

    let str="<table border=4>";
  str+= "<tr> <td>Name</td> <td> Age </td> </tr> ";
  userlist.forEach(

     
                    (coll)=>
                    {
                      str+="<tr>";

                      str+="<td>" + coll["name"] + "</td> <td>" + coll["age"] + "</td>"
                      str+="</tr>";
                    }
              )
  str+="</table>";

document.getElementById("sparesult").innerHTML=str;


}


function register()
{
  let uname=document.getElementById("txtname").value;
let age=document.getElementById("txtage").value;

let password=document.getElementById("txtpass").value;

let addr=document.getElementById("addr").value;


let newuser = {
              "name":uname,
              "age":age
              }


if( (password.length>5) && (age>=18) )
{

    alert("Hai welcome" + uname + "/n" + " Address is " + addr);

    userlist.push(newuser);
    display();

  }
else
{
    alert("Invalid input");
}

document.getElementById("txtname").value="";
document.getElementById("txtage").value="";
document.getElementById("txtpass").value=""
document.getElementById("addr").value="";

 
//window.open("/...");

}


function showred()
{
  //  document.getElementsByTagName("h1")[0].style.color="red";

  document.getElementsByClassName("clsh1")[0].style.color="red";
}

function showblue()
{
    document.getElementsByTagName("h1")[0].style.color="blue";
}

function changeColor()
{
document.getElementById("sparesult").style.background="yellow";
}

function commitData()
{
    document.getElementById("sparesult").innerHTML="<b> Data is committed </b>";
}

//display()