function outer(){
    let count=0;
    return function(){
        count++;
        console.log(count);
    }
    
}
let fun =outer();
fun();
fun();

//object instance
let obj={
    name:"abc",
    display:function(name){
        console.log(name);
        console.log(this.name);

    }
}
obj.display("xyz");

//