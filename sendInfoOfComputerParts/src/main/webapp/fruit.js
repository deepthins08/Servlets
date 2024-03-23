
let getFields={
"cname":false,
"id":false,
"fruit":false,
"kg":false,
"cost":false,
"check":false
}

function validate(){

let flag=false;

for(let[key,value] of Object.entries(getFields)){
if(value===false){

flag=true;
break;
}
}
if(!flag){
document.getElementById("btn").removeAttribute("disabled");
}else{
document.getElementById("btn").setAttribute("disabled","");
}
}

function setName(){
let cname=document.getElementById("cname");
let error=document.getElementById("nerror");

if(cname.value.trim()===""){
error.innerHTML="Please enter a valid name";
error.style.color='red';
getFields["cname"]=false;
}
else{

getFields["cname"]=true;
error.innerHTML="";
}
validate();
}

function customerId(){
let cid=document.getElementById("id");
let error=document.getElementById("merror");

if(cid.value.trim().length==8){
getFields["id"]=true;
error.innerHTML=""
}
else{
error.innerHTML="Please enter a valid Customer Id. Id should be in 8 Characters or Numbers";
error.style.color='red';
getFields["id"]=false;
}
validate();
}

function getFruit(){
let fruit=document.getElementById("fruit");
let error=document.getElementById("nameError");

if(fruit.value!="0"){
error.innerHTML="";
getFields["fruit"]=true;
}
else{
error.innerHTML="Please select a fruit";
error.style.color='red';
getFields["fruit"]=false;
}
validate();
}

function setQuantity(){
let kg=document.getElementById("kg");
let error=document.getElementById("kgError");

if(kg.value!="0"){
error.innerHTML="";
getFields["kg"]=true;
}
else{
error.innerHTML="Please select quantity";
error.style.color='red';
getFields["kg"]=false;
}
validate();
}

function buy(){

let error=document.getElementById("radioError");

if(document.fruitOrder.cost[0]==false && document.fruitOrder.cost[1]==false){
error.innerHTML="Please select any payment method";
error.style.color='red';
getFields["cost"]=false;

}
else{

error.innerHTML="";
getFields["cost"]=true;

}
validate();
}

function confirm(){
let check=document.getElementById("check");
let error=document.getElementById("box");

if(!check.checked){
error.innerHTML="Please Confirm the Payment";
getFields["check"]=false;
}
else{
error.innerHTML="";
getFields["check"]=true;

}
validate();
console.log(check.value);
}






//document.addEventListener('DOMContentLoaded', function() {
//    var form = document.getElementById("order");
//    var submit = document.getElementById("btn");
//    var inputs=form.querySelectorAll('input','select');
//
//    function areAllFieldsFilled(){
//    for( var i=0;i<inputs.length;i++){
//    if(!inputs[i].value && inputs[i].type!=='checkbox' && inputs[i].type!=='radio'){
//
//    return false;
//    }
//
//    }
//    return true;
//    }
//
//    form.addEventListener('input', function() {
//        submit.disabled = !areAllFieldsFilled();
//    });
// form.addEventListener('submit', function(event) {
//        event.preventDefault();
//
//        if(form.checkValidity()){
//        form.submit();
//        }
//
//        else{
//        form.classList.add('was-validated');
//        }
//    });
//
//});
//
//var mobile=document.getElementById("mobile").value;
//if(mobile.length!=10){
//var error=document.getElementById("merror");
//
//error.innerHTML="Please enter valid mobile numbers";
//}
//else{
//    var error=document.getElementById("merror");
//    error.innerHTML="";
//}
//
//if(document.fruitOrder.payment[0].checked==false && document.fruitOrder.payment[1].checked==false){
//var radio=document.getElementById("radioError");
//radio.innerHTML="Please select the payment method";
//radio.style.color='red';
//}
//else{
//var radio=document.getElementById("radioError");
//radio.innerHTML="";
//}