let colors=["red","blue","yellow","black","white"]

let ansarray=colors.filter( (col)=> col.startsWith("b"));

// console.log(ansarray);
// console.log(colors);

let maparray=colors.map( col=> col.toUpperCase())

// console.log(maparray);




// reduce (output,arrelement) => return calcu , initial value of output


let answer=    colors.reduce(
                    (cnt, col)=>
                        {
                              //cnt+= col.length > 4 ? 1 : 0 ;
                              if (col.startsWith("b"))
                              {
                              cnt=cnt+1;
                              }
                              return cnt;
                        },

                       0


                );

//console.log(" count is " + answer)

 let resultarr=      colors.reduce ( (res,col)=>
                                            {
                                                    if (col.startsWith("b"))
                                                    {
                                                        res.push(col);
                                                    }
                                                    return res;
                                            },
                                []
                                );

       //     resultarr.forEach (e=> console.log(e))
//console.log("result array after reduce " + resultarr)
let cities=["chennai","mumbai",["calicut","pune"], "delhi","blore"]

let flatarr=cities.flat()
// console.log(flatarr)

// cities.forEach ( ele=> {
//                             if (Array.isArray(ele))
//                             ele.forEach( subele=>console.log (subele) );
//                             else

//                             console.log(ele)
//                         }
//                 )

 let answerval=       colors.map( col=>col.toUpperCase())
                            .filter ( col => col.startsWith("B"))
                            .reduce( (cnt , col) => 
                            {
                                        cnt++;
                                        return cnt;
                            },
                            0
                         )

console.log( "count of colors starting with b " + answerval)