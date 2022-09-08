let calcuFun  = function (f1,x,y)
                {
                       console.log( f1(x,y) );

                }


                calcuFun( (n1,n2)=> {
                                         if (n1>n2)
                                         return n1;
                                         else
                                         return n2;
                                    } ,

                                    24,
                                    65
                
                
                      );

                calcuFun (  (n1,n2) =>  n1+n2 , 10,20 )
            