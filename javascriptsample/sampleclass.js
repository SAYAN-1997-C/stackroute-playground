class Employee
{
    empid=0;
    empname="";
    designation="";
    constructor(eid,ename,desig)
    {
        this.empid=eid;
        this.empname=ename;
        this.designation=desig;
    }
    display()
    {
        console.log("name is " + this.empname + " desig is " + this.designation );
    }
};

let empobj1=new Employee(10,"Varun","developer");
let empobj2=new Employee(20,"Victor","Tech lead");
let empobj3=new Employee(30,"Rudra","developer");

let employees = [empobj1,empobj2,empobj3]

let devarr= employees.filter ( emp=> emp.designation==="developer");

//devarr.forEach ( emp=> emp.display() )

//let resultarr=employees.map( emp=> emp.empname )

employees.map( emp=> emp.empname ).forEach ( str=> console.log(str))