
 function recharge(){
 var submit=document.getElementById("submit");
 var id=document.getElementById("cust");
 var error=document.getElementById("cerror");
 console.log(id.value)
        if(id.value.length==8){
        console.log("Valid Id")
        submit.removeAttribute('disabled');
         error.innerHTML=""
}
else{
 console.log("Please enter the valid customer id")

        error.innerHTML="Please enter the valid Customer id"
        error.style.color='red';
        submit.setAttribute('disabled','');
        }

var ven=document.getElementById("ven");
var error1=document.getElementById("verror");
console.log(ven.value)
        if(ven.value!=="0"){
       console.log("Valid vendor")
        submit.removeAttribute('disabled');
         error1.innerHTML=""
        }
        else{
          console.log("Please select the valid vendor")

                        error1.innerHTML="Please select the valid Vendor"
                        error1.style.color='red';
                        submit.setAttribute('disabled','')
                        }

        var amnt=document.getElementById("amnt");
        var amount = parseFloat(amnt.value);
        var error2=document.getElementById("aerror");
             console.log(amount);
              if(amount>10 || amount<10000 || !isNaN(amount)){
             console.log("Valid amount")
              submit.removeAttribute('disabled')
               error2.innerHTML=""
                }
else{
 console.log("Please Enter Valid Recharge Amount")

                   error2.innerHTML="Please enter the valid Recharge Amount"
                   error2.style.color='red';
                   submit.setAttribute('disabled','');
                   }

var rtype=document.getElementById("rtype");
var error3=document.getElementById("terror");
console.log(rtype.value)
        if(rtype.value!=="0"){
         console.log("valid Recharge Type")
          submit.removeAttribute('disabled');
        }
       else{
       console.log("Please select the valid vendor")

                             error3.innerHTML="Please select the valid Vendor"
                             error3.style.color='red';
                             submit.setAttribute('disabled','');
                             }

        var check=document.getElementById("check")
        var error4=document.getElementById("box")
        console.log(check.value)
        if(check.checked){
         console.log("Checked")
          submit.removeAttribute('disabled');
        }
        else{

        error4.innerHTML="Please Accept the Condition"
        error4.style.color='red';
        submit.setAttribute('disabled','');
        }



 if (id.value.length === 8 && ven.value !== "0" && !isNaN(amount) && amount >= 10 && amount <= 10000 && rtype.value !== "0" && check.checked) {
                submit.disabled = false;
            } else {
                submit.disabled = true;
            }
}

//document.addEventListener('DOMContentLoaded', function() {
//    var form = document.getElementById("rechargeForm");
//    var submit = document.getElementById("submit");
//
//    form.addEventListener('input', function() {
//        submit.disabled = !form.checkValidity();
//    });
//});

//
//function recharge() {
//    var submit = document.getElementById("submit");
//    var id = document.getElementById("cust");
//    var error = document.getElementById("cerror");
//
//    var ven = document.getElementById("ven");
//    var error1 = document.getElementById("verror");
//
//    var amnt = document.getElementById("amnt");
//    var amount = parseFloat(amnt.value);
//    var error2 = document.getElementById("aerror");
//
//    var rtype = document.getElementById("rtype");
//    var error3 = document.getElementById("terror");
//
//    var check = document.getElementById("check");
//    var error4 = document.getElementById("box");
//
//    var isValid = true; // Flag to check overall validity
//
//
//    // Check Customer ID
//    if (id.value.length != 8) {
//        console.log("Please enter the valid customer id");
//        error.innerHTML = "Please enter the valid Customer id";
//        error.style.color = 'red';
//        isValid = false;
//    } else {
//
//        console.log("Valid Id");
//        error.innerHTML = "";
//    }
//
//    // Check Vendor
//    if (ven.value === "0") {
//        console.log("Please select the valid vendor");
//        error1.innerHTML = "Please select the valid Vendor";
//        error1.style.color = 'red';
//        isValid = false;
//    } else {
//        console.log("Valid vendor");
//        error1.innerHTML = "";
//    }
//
//    // Check Recharge Amount
//    if (isNaN(amount) || amount < 10 || amount > 10000) {
//        console.log("Please Enter Valid Recharge Amount");
//        error2.innerHTML = "Please enter the valid Recharge Amount";
//        error2.style.color = 'red';
//        isValid = false;
//    } else {
//        console.log("Valid amount");
//        error2.innerHTML = "";
//    }
//
//    // Check Recharge Type
//    if (rtype.value === "0") {
//        console.log("Please select the valid recharge type");
//        error3.innerHTML = "Please select the valid Recharge Type";
//        error3.style.color = 'red';
//        isValid = false;
//    } else {
//        console.log("Valid Recharge Type");
//        error3.innerHTML = "";
//    }
//
//    // Check Terms Acceptance
//    if (!check.checked) {
//        console.log("Please Accept the Condition");
//        error4.innerHTML = "Please Accept the Condition";
//        error4.style.color = 'red';
//        isValid = false;
//    } else {
//        console.log("Checked");
//        error4.innerHTML = "";
//    }
//
//    // Enable or disable submit button based on overall validity
//    if (isValid) {
//        submit.removeAttribute('disabled');
//    } else {
//        submit.setAttribute('disabled', '');
//    }
//}
