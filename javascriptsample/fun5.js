function funValidate(age)
{
    if (age>=58)
      return true;
      else
      return false;
}

// let funCalcu = function (sal)
//             {
//                     return sal*15/100;
//             }
function processPension(fun1,fun2,age,salary)
{
    let pensionamt=0;
    if (fun1(age))
    {
      pensionamt= fun2(salary);
      console.log("eligible for  " + pensionamt);
    }
    else
    console.log("Not eligible ");
}

processPension(funValidate, (sal)=>sal*15/100  ,65,45000)