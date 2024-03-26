
let getFields={
"cname":false,
"mail":false,
"college":false,
"deg":false,
"stream":false,
"branch":false,
"percentage":false
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
let error=document.getElementById("nameError");

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
  function validateEmail(email) {
            // Regular expression pattern for validating email addresses
            const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

            // Test the input email against the pattern
            return emailPattern.test(email);
        }

        function setMail() {
            let emailInput = document.getElementById("mail");
            let errorSpan = document.getElementById("mailError");

            // Get the value of the email input field
            let email = emailInput.value.trim();

            // Check if the email is valid
            if (validateEmail(email)) {
                // Email is valid
                errorSpan.innerHTML = "";
                getFields["mail"] = true;
            } else {
                // Email is invalid
                errorSpan.innerHTML = "Please enter a valid email address.";
                errorSpan.style.color = 'red';
                getFields["mail"] = false;
            }

            validate();
        }

function setCollege(){
let fruit=document.getElementById("college");
let error=document.getElementById("collegeError");

if(fruit.value!="0"){
error.innerHTML="";
getFields["college"]=true;
}
else{
error.innerHTML="Please select a College";
error.style.color='red';
getFields["college"]=false;
}
validate();
}

function setDegree(){
let kg=document.getElementById("deg");
let error=document.getElementById("degreeError");

if(kg.value!="0"){
error.innerHTML="";
getFields["deg"]=true;
}
else{
error.innerHTML="Please select Degree";
error.style.color='red';
getFields["deg"]=false;
}
validate();
}

function setStream(){
let kg=document.getElementById("stream");
let error=document.getElementById("streamError");

if(kg.value!="0"){
error.innerHTML="";
getFields["stream"]=true;
}
else{
error.innerHTML="Please select Stream";
error.style.color='red';
getFields["stream"]=false;
}
validate();
}

function setBranch(){
let kg=document.getElementById("branch");
let error=document.getElementById("branchError");

if(kg.value!="0"){
error.innerHTML="";
getFields["branch"]=true;
}
else{
error.innerHTML="Please select a Branch";
error.style.color='red';
getFields["branch"]=false;
}
validate();
}


function setPercentage(){
let percentage=document.getElementById("percentage");
let error=document.getElementById("percentageError");

if(percentage.value.trim().length==5){
getFields["percentage"]=true;
error.innerHTML="";

}
else{
error.innerHTML="Please enter valid percentage";
error.style.color='red';
getFields["percentage"]=false;

}
validate();
}

