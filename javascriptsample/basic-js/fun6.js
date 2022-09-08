let sumall= function (funsqr , funcube,x )
            {
                console.log( funcube(x) +funsqr (x));
            }


//sumall( (num)=> ++num, (x)=>x*x*x , 5 );

sumall ( (num) => { if (num>0) 
                        return ++num;
                    else
                     return -10; }
                      ,
                      (x)=>x+x/10,
                        15  )  ;
