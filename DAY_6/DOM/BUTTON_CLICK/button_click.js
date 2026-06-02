let btn=document.createElement("button");
btn.innerText="click here";
let div = document.createElement("div");
div.align = "center";
btn.onclick=function(){
     let num = Math.floor(Math.random() * 5);

     if (num === 0) document.body.style.backgroundColor = "red";
     else if (num === 1) document.body.style.backgroundColor = "blue";
     else if (num === 2) document.body.style.backgroundColor = "green";
     else if (num === 3) document.body.style.backgroundColor = "yellow";
     else document.body.style.backgroundColor = "orange";
    
};
div.appendChild(btn);
document.body.appendChild(div); 

 