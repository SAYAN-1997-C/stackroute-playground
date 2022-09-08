function calcuFun(opr,num1,num2)
{
    let ans;
          switch(opr)
          {
                case 1:
                        ans= num1+num2;
                        break;
                case 2:
                        ans= num1-num2;
                        break;

                default:
                        return 0;

          }
        return ans;
}

function funChoice(num)
{
         return num*num;
}

let ans = calcuFun(1,15,10) + funChoice(7)

console.log("answer is " + ans)

