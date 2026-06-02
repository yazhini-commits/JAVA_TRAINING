const name="xyz";
let age;
age=10;
console.log(name+" "+age);
//function
function add(a,b){
    return a+b;
}
console.log(add(9,1));

const add2=function(a,b){
    return a+b;
}
console.log(add2(3,4));


const add3=(a,b)=>a+b;
console.log(add3(10,20));

console.log("welcome"+name);
console.log(`welcome ${name}`);


let arr=[10,20,30,40,50];
console.log(arr);
console.log(arr.pop());
//push()
//shift()=>[20,30,40]=>Removes the first value in the list
//let s1=arr.unshift(200);=>[200,20,30,40]=> adds the  value in the first
let s2=arr.splice(1,3);//=> [20,30,40]=> it gets the value from start to end-1=> it modifies in the original array 
let s3=arr.slice(1,3);//=> [10]=> it also gets the values in the range from start to end-1=>it creates the new array and make changes in it
console.log(arr.includes(2));//includes()
console.log("here"+" "+s2);
console.log(s3);
console.log(arr+""+s2);


//object 
let student ={
    id:1,
    name:"abc",
    city:"pondy",
    address:{
        house_no:23,
        street:"gandhi nagar"  
    },
    marks:[80,77,94,100],
};
console.log(student.name);
console.log(student.marks);
console.log(student.address.street);
//destructure
let arr2=[10,20,30,40,50]
let[a,b]=arr2;
console.log(a+" "+b);

//spread(...)=> it should not give to start range
let arr3=[1,2];
let arr4=[...arr3,5,6];
//let [a,b,...c]=arr4;

//function spread rest parameter
function sum(...nums){
    console.log(nums);
}
(sum(4,5,9,6,0));


//CALLBACK_FUNCTION
