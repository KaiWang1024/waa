$(document).ready(function(){
    console.log('------');

    $('#empSubmitBtn').click(function(event){

        event.preventDefault();
        console.log('click....');
        let data = JSON.stringify({ name: "a", salary: 6 });
        JSON.stringify($('#ajaxform').serializeFromJSON());
        $.ajax({
            type: 'POST',
            url: 'http://localhost:8080/ajax/post',
            data: data,
            contentType: "application/json",
            dataType: "json",
            success: function(employee){
                console.log("success....");
            },
            error: function(error){
                console.log("fail....");
                console.log(error.responseJSON);
                let errorJson = error.responseJSON;

                if(errorJson.errorType == "ValidationError"){
                    let errorList = errorJson.fieldErrors;
                    var errorDiv = "";
                    $.each(errorList, function(index, error){
                        errorDiv += "<p>"+error.message+"</p>";
                    });

                    $("#form-result").append(errorDiv);

                }else{
                    
                }


            }
        });



    });







});