function printLine()
{
    setTimeout( ()=> 
      {

      for(i=0;i<=10000;i++)
       console.log("*")
      },3000
    );
}

function welcomeuser()
{
    console.log("Hai welcome to the sample program");
}

function mainall()
{
    printLine();
    welcomeuser();
    console.log("Main program is being called");
}

mainall();