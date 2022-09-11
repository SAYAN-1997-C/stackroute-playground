function myfun(num)
{
  let promobj=new Promise( (resolve,reject)=>
                            {
                            if (num>=18)
                            resolve("eligible");
                            else
                                reject("age not eligible");
                            } 

  );

  return promobj;

    }

myfun(19).then  ( res=> console.log("successful " + res) )
        .catch  ( err=> console.log("not successful " + err) )