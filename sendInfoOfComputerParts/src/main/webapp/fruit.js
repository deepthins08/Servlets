
document.addEventListener('DOMContentLoaded', function() {
    var form = document.getElementById("order");
    var submit = document.getElementById("btn");
    var inputs=form.querySelectorAll('input','select');

    function areAllFieldsFilled(){
    for( var i=0;i<inputs.length;i++){
    if(!inputs[i].value && inputs[i].type!=='checkbox' && inputs[i].type!=='radio'){

    return false;
    }

    }
    return true;
    }

    form.addEventListener('input', function() {
        submit.disabled = !areAllFieldsFilled();
    });
 form.addEventListener('submit', function(event) {
        event.preventDefault();

        if(form.checkValidity()){
        form.submit();
        }

        else{
        form.classList.add('was-validated');
        }
    });

});

