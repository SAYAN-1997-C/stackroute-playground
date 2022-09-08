let age;

username="Anju"
age=33

{
    var username="Mary"
    // let age="twenty"
     console.log("name inside scope " + username)
     console.log('age inside scope  ' + age)
}

console.log("name is  " + username)
console.log("Age is " + age)

var username; // hoisting , pulling the declaration up

