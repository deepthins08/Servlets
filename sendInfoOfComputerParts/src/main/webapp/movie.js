
let getFields={
"cname":false,
"mobile":false,
"movie":false,
"seat":false,
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

function number(){
let cid=document.getElementById("mobile");
let error=document.getElementById("mobileError");

if(cid.value.trim().length==10){
getFields["mobile"]=true;
error.innerHTML=""
}
else{
error.innerHTML="Please enter a valid Mobile Number.";
error.style.color='red';
getFields["mobile"]=false;
}
validate();
}

function selectMovie(){
let fruit=document.getElementById("movie");
let error=document.getElementById("movieError");

if(fruit.value!="0"){
error.innerHTML="";
getFields["movie"]=true;
}
else{
error.innerHTML="Please select a fruit";
error.style.color='red';
getFields["movie"]=false;
}
validate();
}

function bookSeats(){
let kg=document.getElementById("seat");
let error=document.getElementById("seatError");

if(kg.value!="0"){
error.innerHTML="";
getFields["seat"]=true;
}
else{
error.innerHTML="Please select quantity";
error.style.color='red';
getFields["seat"]=false;
}
validate();
}

function buy(){

let error=document.getElementById("radioError");

if(document.bookMovie.cost[0]==false && document.bookMovie.cost[1]==false){
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
error.style.color='red';
getFields["check"]=false;
}
else{
error.innerHTML="";
getFields["check"]=true;

}
validate();
console.log(check.value);
}
