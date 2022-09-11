var itemarr=[];

function getDatafromServer()
{
  fetch("http://localhost:3000/item",
  {
    "method":"GET"
  })
        .then(
                 (res)=>
                 {
                return(res.json());
                 }


        )
        .then
        (
            (resobj)=>{
            itemarr=resobj;
            displayTable();

            }
        )
        .catch(
                (err)=>
                console.log("failed " + err)

        )
}


function displayTable()
{
 let str="<table border=3>";

   str+="<tr><td>Id</td><td> Itemname </td><td> Price</td></tr>";

   if (typeof itemarr!='undefined')
   {
  itemarr.forEach(
    (rowcol)=>
        {
            str+="<tr>";
            str+="<td>"+rowcol["id"] + "</td>";
            str+="<td>" + rowcol["itemname"] + "</td>";
            str+="<td>" + rowcol["price"] + "</td>";
            str+=`<td> <input type=button value=Delete onclick=deleteItem(${rowcol["id"]})></td>`;
            str+="</tr>";


        } );
    }
 str+="</table>";

document.getElementById("spatable").innerHTML=str;
}

function deleteItem(itemid)
{
 fetch(`http://localhost:3000/item/${itemid}`,
  {
    "method":"DELETE"
  })
  .then
  (
       (res)=>{
                   if(res.status==200)
                   {
                    alert("Record deleted ");
                    let ind=itemarr.findIndex( ele=>ele.id==itemid);
                    itemarr.splice(ind,1);
                    displayTable();
                   }
       }
  )
  .catch
  (
     (err)=>
        console.log("some error occured " + err)
     

  )

}

function addItem()
{
 let itemid=document.getElementById("itemid").value;
let iname=document.getElementById("itemname").value;

let price=document.getElementById("price").value;

let data=   {
                 "id":itemid,
                "itemname":iname,
                "price":price
            }

fetch("http://localhost:3000/item",
            {
                    "method":"POST",
                    "headers":{"content-type":"application/json"},
                    "body":JSON.stringify(data)
            })
        .then(
                (res)=>
                {
                       if(res.status==201)
                       {
                         alert("item added");
                         itemarr.push(data);
                         displayTable();
                       }
                }
        )
        .catch(
                (err)=>
                    console.log("error " + err)
        )

}



getDatafromServer();
