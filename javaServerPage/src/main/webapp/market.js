
let getFields={
"cname":false,
"location":false,
"city":false,
"pincode":false,
"area":false,
"type":false,
"stall":false,
"itemName":false,
"itemQuality":false,
"itemQuantity":false,
"itemCost":false,
"stallOwner":false,
"keb":false,
"gst":false,
"transaction":false
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

function setName() {
    let cname = document.getElementById("cname");
    let error = document.getElementById("nameError");

    if (cname.value.trim() === "") {
        error.innerHTML = "Please enter a valid name";
        error.style.color = 'red';
        getFields["cname"] = false;
    } else if (cname.value.trim().length < 5 || cname.value.trim().length > 20) {
        error.innerHTML = "Name must be between 5 and 20 characters long";
        error.style.color = 'red';
        getFields["cname"] = false;
    } else {
        getFields["cname"] = true;
        error.innerHTML = "";
    }
    validate();
}


function setLocation(){
let fruit=document.getElementById("location");
let error=document.getElementById("locationError");

if(fruit.value!="0"){
error.innerHTML="";
getFields["location"]=true;
}
else{
error.innerHTML="Please select a Location";
error.style.color='red';
getFields["location"]=false;
}
validate();
}

function setCity(){
let city=document.getElementById("city");
let error=document.getElementById("cityError");

if(city.value!="0"){
error.innerHTML="";
getFields["city"]=true;
}
else{
error.innerHTML="Please select city";
error.style.color='red';
getFields["city"]=false;
}
validate();
}



function setPincode(){
let pincode=document.getElementById("pincode");
let error=document.getElementById("pincodeError");

if(pincode.value.trim().length==6){
getFields["pincode"]=true;
error.innerHTML="";

}
else{
error.innerHTML="Please enter valid Pincode";
error.style.color='red';
getFields["pincode"]=false;

}
validate();
}



function setArea() {
    let area = document.getElementById("area");
    let error = document.getElementById("areaError");

    if (area.value.trim().length < 5 || area.value.trim().length > 20) {
        error.innerHTML = "Area must be between 5 and 20 characters long";
        error.style.color = 'red';
        getFields["area"] = false;
    } else if (area.value.trim() === "") {
        error.innerHTML = "Please enter a valid area";
        error.style.color = 'red';
        getFields["area"] = false;
    } else {
        getFields["area"] = true;
        error.innerHTML = "";
    }
    validate();
}



function setType(){
let fruit=document.getElementById("type");
let error=document.getElementById("typeError");

if(fruit.value!="0"){
error.innerHTML="";
getFields["type"]=true;
}
else{
error.innerHTML="Please select a Type";
error.style.color='red';
getFields["type"]=false;
}
validate();
}


function setStall() {
    let stall = document.getElementById("stall");
    let error = document.getElementById("stallError");

    let stallNumber = parseInt(stall.value.trim()); // Convert input value to a number

    if (isNaN(stallNumber) || stallNumber < 1 || stallNumber > 1000) {
        error.innerHTML = "Stall number must be a valid number between 1 and 1000";
        error.style.color = 'red';
        getFields["stall"] = false;
    } else if (stall.value.trim() === "") {
        error.innerHTML = "Please enter a valid stall number";
        error.style.color = 'red';
        getFields["stall"] = false;
    } else {
        getFields["stall"] = true;
        error.innerHTML = "";
    }
    validate();
}


function setItemName() {
    let itemName = document.getElementById("itemName");
    let error = document.getElementById("itemNameError");

    if (itemName.value.trim().length < 5 || itemName.value.trim().length > 20) {
        error.innerHTML = "Item name must be between 5 and 20 characters long";
        error.style.color = 'red';
        getFields["itemName"] = false;
    } else if (itemName.value.trim() === "") {
        error.innerHTML = "Please enter a valid item name";
        error.style.color = 'red';
        getFields["itemName"] = false;
    } else {
        getFields["itemName"] = true;
        error.innerHTML = "";
    }
    validate();
}



function setItemQuantity() {
    let itemQuantity = document.getElementById("itemQuantity");
    let error = document.getElementById("itemQuantityError"); // Corrected the element ID

    let quantityNumber = parseInt(itemQuantity.value.trim()); // Convert input value to a number

    if (isNaN(quantityNumber) || quantityNumber < 0 || quantityNumber > 1000) {
        error.innerHTML = "Quantity must be a valid number between 1 and 1000"; // Corrected error message
        error.style.color = 'red'; // Ensure error styling is applied
        getFields["itemQuantity"] = false;
    } else if (itemQuantity.value.trim() === "") {
        error.innerHTML = "Please enter a valid quantity";
        error.style.color = 'red';
        getFields["itemQuantity"] = false;
    } else {
        getFields["itemQuantity"] = true;
        error.innerHTML = "";
    }
    validate();
}



function setItemQuality() {
    let itemQuantity = document.getElementById("itemQuality");
    let error = document.getElementById("itemQualityError");

    if (itemQuantity.value.trim().length < 5 || itemQuantity.value.trim().length > 20) {
        error.innerHTML = "Quantity must be between 5 and 20 characters long";
        error.style.color = 'red';
        getFields["itemQuality"] = false;
    } else if (itemQuantity.value.trim() === "") {
        error.innerHTML = "Please enter a valid quantity";
        error.style.color = 'red';
        getFields["itemQuality"] = false;
    } else {
        getFields["itemQuality"] = true;
        error.innerHTML = "";
    }
    validate();
}



function setItemCost() {
    let itemCost = document.getElementById("itemCost");
    let error = document.getElementById("itemCostError");

    let costNumber = parseFloat(itemCost.value.trim()); // Convert input value to a number

    if (isNaN(costNumber) || costNumber < 0 || costNumber > 1000) {
        error.innerHTML = "Cost must be a valid number between 0 and 1000";
        error.style.color = 'red';
        getFields["itemCost"] = false;
    } else if (itemCost.value.trim() === "") {
        error.innerHTML = "Please enter a valid cost";
        error.style.color = 'red';
        getFields["itemCost"] = false;
    } else {
        getFields["itemCost"] = true;
        error.innerHTML = "";
    }
    validate();
}


function setStallOwner() {
    let stallOwner = document.getElementById("stallOwner");
    let error = document.getElementById("stallOwnerError");

    if (stallOwner.value.trim().length < 5 || stallOwner.value.trim().length > 20) {
        error.innerHTML = "Stall owner's name must be between 5 and 20 characters long";
        error.style.color = 'red';
        getFields["stallOwner"] = false;
    } else if (stallOwner.value.trim() === "") {
        error.innerHTML = "Please enter a valid name";
        error.style.color = 'red';
        getFields["stallOwner"] = false;
    } else {
        getFields["stallOwner"] = true;
        error.innerHTML = "";
    }
    validate();
}



function setKEB() {
    let keb = document.getElementById("keb");
    let error = document.getElementById("kebError");

    if (keb.value.trim().length < 5 || keb.value.trim().length > 20) {
        error.innerHTML = "KEB number must be between 5 and 20 characters long";
        error.style.color = 'red';
        getFields["keb"] = false;
    } else if (keb.value.trim() === "") {
        error.innerHTML = "Please enter a valid KEB number";
        error.style.color = 'red';
        getFields["keb"] = false;
    } else {
        getFields["keb"] = true;
        error.innerHTML = "";
    }
    validate();
}

function setGST() {
    let gst = document.getElementById("gst");
    let error = document.getElementById("gstError");

    let costNumber = parseFloat(gst.value.trim()); // Convert input value to a number

    if (isNaN(costNumber) || costNumber < 0 || costNumber > 1000) {
        error.innerHTML = "GST must be a valid number between 0 and 1000";
        error.style.color = 'red';
        getFields["gst"] = false;
    } else if (gst.value.trim() === "") {
        error.innerHTML = "Please enter a valid GST Number";
        error.style.color = 'red';
        getFields["gst"] = false;
    } else {
        getFields["gst"] = true;
        error.innerHTML = "";
    }
    validate();
}

function setTransaction() {
    let transaction = document.getElementById("transaction");
    let error = document.getElementById("transactionError");

    let costNumber = parseFloat(transaction.value.trim()); // Convert input value to a number

    if (isNaN(costNumber) || costNumber < 0 || costNumber > 1000) {
        error.innerHTML = "Cost must be a valid number between 0 and 1000";
        error.style.color = 'red';
        getFields["transaction"] = false;
    } else if (transaction.value.trim() === "") {
        error.innerHTML = "Please enter a valid cost";
        error.style.color = 'red';
        getFields["transaction"] = false;
    } else {
        getFields["transaction"] = true;
        error.innerHTML = "";
    }
    validate();
}
