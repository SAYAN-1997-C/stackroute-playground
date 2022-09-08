function findTax(salary)
{
    if (salary<5000)
    return 0;
    else if (salary <30000)
    return 18;
    else
    return 24;
}

function displayData(fun1, salary)
{

  let ans=fun1(salary);
  console.log(ans);

}

displayData(findTax,10000)