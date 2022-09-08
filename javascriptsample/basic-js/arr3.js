subjects = ["html","css","c","java","php","javascript"]

let ind = subjects.indexOf("java")

if(ind<0)
console.log("Java is not available in the subjects")
else
{

    subjects.splice(ind,1);
console.log("Removed element from the list " );
}

console.log(subjects)