function doAjaxPost() {
    // get the form values
    var category = $('#category').val();
    var amount = $('#amount').val();
    var date = $('#date').val();

    $.ajax({
        type: "POST",
        url: "http://localhost:8080/addExpense",
        data: "category=" + category + "&amount=" + amount + "&date=" + date,

        success: function(){
            // we have the response
            $('#category_result').html(category);
            $('#amount_result').html(amount);
            $('#date_result').html(date);

        },
        error: function(e){
            alert('Error: ' + e);
        }

    });


}//doAjaxPost
